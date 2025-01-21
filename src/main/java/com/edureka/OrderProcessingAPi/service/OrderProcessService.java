package com.edureka.OrderProcessingAPi.service;

import com.edureka.OrderProcessingAPi.client.PaymentAPIClient;
import com.edureka.OrderProcessingAPi.dto.OrderRequest;
import com.edureka.OrderProcessingAPi.dto.OrderResponse;
import com.edureka.OrderProcessingAPi.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessService {
    @Autowired
    PaymentAPIClient paymentAPIClient;
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Integer totalPrice = orderRequest.getProducts().stream().map(Product::getPrice).reduce(0, Integer::sum);
        Boolean isSuccess = paymentAPIClient.debit(totalPrice);
        if (isSuccess)
            return new OrderResponse("Success");
        else
            return new OrderResponse("Failure");
    }
}
