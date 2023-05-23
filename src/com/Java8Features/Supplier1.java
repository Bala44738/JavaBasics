package com.Java8Features;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> supFun =()->{

            return "Balu";
        };
        f1(supFun);
    }

    public static void f1 (Supplier<String> fun){
        String s1 = fun.get();
        System.out.println(s1);
    }
}
