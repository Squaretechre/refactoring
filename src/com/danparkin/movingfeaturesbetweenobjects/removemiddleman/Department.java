package com.danparkin.movingfeaturesbetweenobjects.removemiddleman;

public class Department {
    private Person _manager;

    public Department(Person manager) {
        _manager = manager;
    }

    public Person getManager() {
        return _manager;
    }
}
