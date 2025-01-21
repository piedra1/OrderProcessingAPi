package com.edureka.OrderProcessingAPi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "PaymentServiceAPI", url = "http://localhost:8083")
public interface PaymentAPIClient {

    @GetMapping("/api/payment")
    Boolean debit(@RequestParam Integer totalPrice);
}
