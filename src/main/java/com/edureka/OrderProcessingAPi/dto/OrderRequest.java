package com.edureka.OrderProcessingAPi.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderRequest {

    private List<Product> products;
}
