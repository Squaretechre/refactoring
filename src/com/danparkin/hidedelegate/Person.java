package com.danparkin.hidedelegate;

public class Person {
    private Department _department;
    public String Name;

    public Person(String name) {
        Name = name;
    }

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department arg) {
        _department = arg;
    }
}
