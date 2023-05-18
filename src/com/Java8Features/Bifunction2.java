package com.Java8Features;

import java.util.function.BiFunction;

public class Bifunction2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> mul=(x,y)->(x*y)+x;
        f1(mul);
    }

    private static void f1(BiFunction<Integer, Integer, Integer> fun) {
       int b1 =fun.apply(7,5);
        System.out.println(b1);
    }
}
