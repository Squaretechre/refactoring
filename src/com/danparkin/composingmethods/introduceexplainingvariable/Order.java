package com.danparkin.composingmethods.introduceexplainingvariable;

public class Order {
    private int _quantity;
    private int _itemPrice;

    public Order(int quantity, int itemPrice) {
        _quantity = quantity;
        _itemPrice = itemPrice;
    }

    public double price() {
        // price is base price - quantity discount + shipping
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }
}
