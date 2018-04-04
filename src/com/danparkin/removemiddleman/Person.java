package com.danparkin.removemiddleman;

public class Person {
    public String Name;
    Department _department;

    public Person(String name) {
        Name = name;
    }

    public Person getManager() {
        return _department.getManager();
    }

    public void setDepartment(Department department) {
        _department = department;
    }
}
