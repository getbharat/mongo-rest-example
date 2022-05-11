package com.example.mongo.rest.model;

public enum Category {
    SOAP("Soap"),
    CLOTH("Cloth"),
    BOOK("Book"),
    ELECTRONICS("Electronic"),
    FOOD("Food");
    private String value;

    public String getValue() {
        return value;
    }

    Category(final String name) {
        this.value = name;
    }
}
