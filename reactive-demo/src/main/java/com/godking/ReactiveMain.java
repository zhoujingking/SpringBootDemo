package com.godking;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;


public class ReactiveMain {
    public static void main(String[] args) {
        var flux = Flux.just(1, 2, 3, 4);
        flux.map(i -> {
                    System.out.println(i);
                    return i * i;
                })
                .zipWith(Flux.range(10, 10), (one, two) -> String.format("Flux one: %d, Flux two: %d", one, two))

                .subscribe(new Subscriber<>() {
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        subscription.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("done");
                    }
                });
    }
}
