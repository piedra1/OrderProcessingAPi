package com.edureka.OrderProcessingAPi.dto;





public class Product {

    private Integer itemID;
    private Integer price;

    public Product(Integer itemID, Integer price) {
        this.itemID = itemID;
        this.price = price;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
