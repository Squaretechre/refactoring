package com.danparkin.movefield;

public class SelfEncapsulatedAccount {
    private AccountType _type;
    private double _interestRate;

    public SelfEncapsulatedAccount(AccountType type, double interestRate) {
        _type = type;
        _interestRate = interestRate;
    }

    public double interestForAmountDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    private void setInterestRate(double arg) {
        _interestRate = arg;
    }

    private double getInterestRate() {
        return _interestRate;
    }
}
