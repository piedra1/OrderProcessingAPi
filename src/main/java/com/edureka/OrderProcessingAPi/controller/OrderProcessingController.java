package com.edureka.OrderProcessingAPi.controller;

import com.edureka.OrderProcessingAPi.dto.OrderRequest;
import com.edureka.OrderProcessingAPi.dto.OrderResponse;
import com.edureka.OrderProcessingAPi.service.OrderProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderProcessingController {

    @Autowired
    public OrderProcessService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> orderProducts(@RequestBody OrderRequest orderRequest) {
        OrderResponse order = orderService.placeOrder(orderRequest);

        return new ResponseEntity<OrderResponse>(order, HttpStatus.CREATED);
    }
}
