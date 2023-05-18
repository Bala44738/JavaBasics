package com.Java8Features;

import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        Function<Integer, Integer> mult = (x) -> {
            System.out.println("Input val " + x);
            int z = x * x*x;
            return z;
        };
        f1(mult);
    }
    public static Function<Integer,Integer> f1(Function<Integer,Integer> fun){
        int r1=fun.apply(4);
        int r2=fun.apply(8);
        System.out.println(r1);
        System.out.println(r2);
        return fun;
    }
}
