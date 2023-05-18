package com.statements;

public class DivisibleBy2And3 {

    public static void main(String args[]){
        int n = 24;
        if(n % 6==0){   // LCM of 2 and 3 = 6  (you can divisible with any numbers, you must divisible with LCM of those numbers)
            System.out.println("Given number is divisible by 2 and 3.");
        } else {
            System.out.println("Given number is Not divisible by 2 and 3.");
        }
    }
}
