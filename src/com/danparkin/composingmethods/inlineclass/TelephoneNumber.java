package com.danparkin.composingmethods.inlineclass;

public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    public TelephoneNumber(String areaCode, String number) {
        _areaCode = areaCode;
        _number = number;
    }

    public String getTelephoneNumber() {
        return ("(" + _areaCode + ") " + _number);
    }

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String arg) {
        _areaCode = arg;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String arg) {
        _number = arg;
    }
}
