package com.danparkin.composingmethods.removeassignmenttoparameters;

import java.util.Calendar;

public class ObjectParam {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR, 1998);
        c1.set(Calendar.MONTH, Calendar.APRIL);
        c1.set(Calendar.DAY_OF_MONTH, 1);

        nextDateUpdate(c1);
        System.out.println("c1 after nextDateUpdate: " + c1.getTime());

        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.YEAR, 1998);
        c2.set(Calendar.MONTH, Calendar.APRIL);
        c2.set(Calendar.DAY_OF_MONTH, 1);

        nextDateReplace(c2);
        System.out.println("c2 after nextDateReplace: " + c2.getTime());
    }

    private static void nextDateUpdate(Calendar arg) {
        arg.set(Calendar.YEAR, 1998);
        arg.set(Calendar.MONTH, Calendar.APRIL);
        arg.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println("arg in nextDateUpdate: " + arg.getTime());
    }

    private static void nextDateReplace(Calendar arg) {
        arg = Calendar.getInstance();
        arg.set(Calendar.YEAR, 1998);
        arg.set(Calendar.MONTH, Calendar.APRIL);
        arg.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println("arg in nextDateReplace: " + arg.getTime());
    }
}
