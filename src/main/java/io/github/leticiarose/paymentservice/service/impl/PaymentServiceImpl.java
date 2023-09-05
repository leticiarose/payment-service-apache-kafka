package io.github.leticiarose.paymentservice.service.impl;

import io.github.leticiarose.paymentservice.model.Payment;
import io.github.leticiarose.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Pagamento Recebido {}", payment);
    }
}
