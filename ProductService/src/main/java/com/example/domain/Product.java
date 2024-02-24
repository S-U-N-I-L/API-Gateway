package com.example.domain;

public class Product {
    private long productId;

    public long getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    private String description;
    private String name;

    public Product(long pId,String name,String desc){
        this.productId = pId;
        this.name = name;
        this.description = desc;
    }
}
