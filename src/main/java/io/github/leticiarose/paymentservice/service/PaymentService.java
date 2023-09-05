package io.github.leticiarose.paymentservice.service;

import io.github.leticiarose.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
