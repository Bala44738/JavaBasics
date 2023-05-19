package com.Java8Features;

import java.util.function.Function;

public class primeNumbers {
    public static void main(String[] args) {


    Function<Integer,Boolean> isPrime = (x)->{
             int count =0;
             for (int i =1;i<=x;i++){
                 if (x%i==0) {
                     count++;
                 }
             }
        return true;
    };
        boolean b = isPrime.apply(11);
        System.out.println(b);
    }
}
