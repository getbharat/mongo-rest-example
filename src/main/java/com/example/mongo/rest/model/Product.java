package com.example.mongo.rest.model;

import java.util.Date;
import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private Category category;
    private String description;
    private float price;
    private Date mfgDate;

    public Product(int productId, String name, Category category, String description, float price, Date mfgDate) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.mfgDate = mfgDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId() && Float.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getName(), product.getName()) && getCategory() == product.getCategory() && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(getMfgDate(), product.getMfgDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getName(), getCategory(), getDescription(), getPrice(), getMfgDate());
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }
}
