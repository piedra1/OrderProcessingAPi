package com.edureka.OrderProcessingAPi.dto;



import java.util.List;


public class OrderRequest {

    private List<Product> products;

    public OrderRequest(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
