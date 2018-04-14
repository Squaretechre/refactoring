package com.danparkin.composingmethods.inlinemethod;

public class Customer {
    private final int _numberOfLateDeliveries;

    public Customer(int numberOfLateDeliveries) {
        _numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
