package com.Functions;

public class CallByValue {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);
        int result = changeAge(age);
        System.out.println(result);
    }
    public static int changeAge(int a){
        a=30;
        return a;
    }
}
