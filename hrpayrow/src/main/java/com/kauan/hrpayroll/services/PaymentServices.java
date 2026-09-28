package com.kauan.hrpayroll.services;

import com.kauan.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
