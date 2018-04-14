package com.danparkin.composingmethods.removeassignmenttoparameters;

public class PrimitiveParam {
    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println("x after triple: " + x);
    }

    private static void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg in triple: " + arg);
    }
}
