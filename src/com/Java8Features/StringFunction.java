package com.Java8Features;

import java.util.function.Function;

public class StringFunction {
    public static void main(String[] args) {
    Function<String,String> toUpper = (x)->x.toUpperCase();
    Function<Integer,Integer> add = (x)->x+x;
    f1(toUpper,add);
    }
    private static void f1(Function<String, String> upper, Function<Integer, Integer> ad) {
        String str = upper.apply("bala babu");
        int i = ad.apply(6);
        System.out.println(str);
        System.out.println(i);
    }
}