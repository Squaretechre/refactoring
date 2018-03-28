package com.danparkin.inlinetemp;

public class Order {
    private int _basePrice;

    public Order(int basePrice) {
        _basePrice = basePrice;
    }

    public int basePrice() {
        return _basePrice;
    }
}
