package com.godking.hotstream;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class HotStreamMain {
    public static void main(String[] args) {
        ConnectableFlux<Object> connectableFlux = Flux.create(fluxSink -> {
            while (true) {
                fluxSink.next(System.currentTimeMillis());
            }
        }).sample(Duration.ofSeconds(2)).publish();

        connectableFlux.subscribe(System.out::println);
        connectableFlux.subscribe(System.out::println);

        connectableFlux.connect();
    }
}
