package com.Java8Features;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {

        // First Integer is input tupe. and Second Integer is return type
        Function<Integer,Integer> mul=(x)->x*x;  // ((x)->x*x)->Lazy evalution Or Function defination
        f1(mul);
    }
    public static void f1(Function<Integer,Integer> fun){
        int r1 = fun.apply(5);
        int r2 = fun.apply(8);
        int r3 = fun.apply(12);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
