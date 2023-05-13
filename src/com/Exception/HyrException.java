package com.Exception;

public class HyrException {

    public static void main(String[] args) {
        method2();
    }

    public static void method2(){

        method1();
    }
    public static void method1(){
        int fNumber = 25;
        int lNumber= 0;
        int result = fNumber/lNumber;
    }
}
