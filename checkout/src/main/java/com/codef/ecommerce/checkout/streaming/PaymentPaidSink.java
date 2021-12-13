package com.codef.ecommerce.checkout.streaming;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public class PaymentPaidSink {
    String INPUT = "payment-paid-input";

    @Input(INPUT)
    SubscribableChannel input();
}
