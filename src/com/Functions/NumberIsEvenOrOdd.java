package com.Functions;

public class NumberIsEvenOrOdd {

    public static void main(String[] args) {
        boolean r = isEven(8);
        System.out.println(r);
    }
    private static boolean isEven(int i) {
        boolean result = i%2==0;
        return result;
    }
}
