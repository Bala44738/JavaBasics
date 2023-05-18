package com.statements;

public class DivisibleBy2ButNot5 {
    public static void main(String[] args) {
        int num = 20;
        if (num%2==2&&num%5!=0) {
            System.out.println("Number is dividible by 2 but not divisible by 5");
        }else{
            System.out.println("Number is dividible by 2 or 5");
        }
    }
}
