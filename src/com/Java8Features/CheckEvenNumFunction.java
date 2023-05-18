package com.Java8Features;

import java.util.function.Function;

public class CheckEvenNumFunction {
    public static void main(String[] args) {
        Function<Integer,Boolean> isEven = (x)->{boolean b= false;
        if(x%2==0){
        b=true;
        }
            return b;
        };
        f1(isEven);
    }
    private static void f1(Function<Integer, Boolean> isEven) {
        Boolean b = isEven.apply(10);
        System.out.println(b);
        Boolean b1 = isEven.apply(55);
        System.out.println(b1);
    }
}
