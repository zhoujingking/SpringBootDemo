package com.godking.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CouponService {

    @EventListener
    public void onTestEvent(LoginSuccessEvent loginSuccessEvent){
        var source = (String) loginSuccessEvent.getSource();
        sendCoupon(source);
    }

    public void sendCoupon(String username) {
        log.info("sent coupon to {}", username);
    }
}
