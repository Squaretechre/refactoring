package com.danparkin.movemethod;

public class AccountType {
    private final boolean _isPremium;

    public AccountType(boolean isPremium) {
        _isPremium = isPremium;
    }

    public boolean isPremium() {
        return _isPremium;
    }
}
