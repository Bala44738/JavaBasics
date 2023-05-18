package com.Java8Features;

import java.util.function.Function;

public class Function3 {
    public static void main(String[] args) {
        Function<Integer,Integer> fun = f1();
        int r1 = fun.apply(7);
        System.out.println(r1);
    }

    private static Function<Integer, Integer> f1() {
        Function<Integer,Integer> mul=(x)->x*x;
        return mul;
    }
}
