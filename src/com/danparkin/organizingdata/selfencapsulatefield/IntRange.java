package com.danparkin.organizingdata.selfencapsulatefield;

public class IntRange {
    private int _low;
    private int _high;

    public IntRange(int low, int high) {
        _low = low;
        _high = high;
    }

    public boolean includes(int arg) {
        return arg >= _low & arg <= _high;
    }

    public void grow(int factor) {
        _high = _high * factor;
    }
}
