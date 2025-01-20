package com.edureka.OrderProcessingAPi.service;

import com.edureka.OrderProcessingAPi.client.PaymentAPIClient;
import com.edureka.OrderProcessingAPi.dto.OrderRequest;
import com.edureka.OrderProcessingAPi.dto.OrderResponse;
import com.edureka.OrderProcessingAPi.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProcessService {

    PaymentAPIClient paymentAPIClient;
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Integer totalPrice = orderRequest.getProducts().stream().map(Product::getPrice).reduce(0, Integer::sum);
        Boolean isSuccess = paymentAPIClient.debit(totalPrice);
        if (isSuccess)
            return OrderResponse.builder().response("Success").build();
        else
            return OrderResponse.builder().response("Failure").build();
    }
}
