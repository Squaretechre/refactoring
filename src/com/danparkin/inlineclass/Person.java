package com.danparkin.inlineclass;

public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone;

    public Person(String name, TelephoneNumber officeTelephone) {
        _name = name;
        _officeTelephone = officeTelephone;
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }
}
