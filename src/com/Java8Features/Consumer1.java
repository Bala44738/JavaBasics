package com.Java8Features;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String> dumFun= x->{
            System.out.println(x);
        } ;
      f1(dumFun);
    }

    public static void f1(Consumer<String> dumFun){
       dumFun.accept("Balu");
    }
}
