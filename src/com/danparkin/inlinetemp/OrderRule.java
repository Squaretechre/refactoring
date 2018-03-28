package com.danparkin.inlinetemp;

public class OrderRule {
    private Order _order;

    public OrderRule(Order order) {
        _order = order;
    }

    public boolean validate() {
        double basePrice = _order.basePrice();
        return (basePrice > 1000);
    }
}
