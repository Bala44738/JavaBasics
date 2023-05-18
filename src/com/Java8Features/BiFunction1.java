package com.Java8Features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction1 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> fun=f1();
        int b1 = fun.apply(6,8);
        System.out.println(b1);
    }

    private static BiFunction<Integer,Integer,Integer> f1() {
        BiFunction<Integer,Integer,Integer> mul = (x,y)->x*y;

        return mul;
    }
}
