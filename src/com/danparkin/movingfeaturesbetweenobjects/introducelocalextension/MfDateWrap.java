package com.danparkin.movingfeaturesbetweenobjects.introducelocalextension;

import java.util.Date;

public class MfDateWrap {
    private final Date _original;

    public MfDateWrap(String dateString) {
        _original = new Date(dateString);
    }

    public MfDateWrap(Date arg) {
        _original = arg;
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }

    public int getYear() {
        return _original.getYear();
    }

    public int getMonth() {
        return _original.getMonth();
    }

    public int getDate() {
        return _original.getDate();
    }

    public boolean equals(MfDateWrap arg) {
        return (toDate().equals(arg.toDate()));
    }

    private Date toDate() {
        return _original;
    }
}
