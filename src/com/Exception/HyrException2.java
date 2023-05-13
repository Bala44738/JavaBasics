package com.Exception;

public class HyrException2 {
    public static void main(String[] args) {


        int fNumber = 5;
        int lNumber = 0;
        int result = 0;
        String str = "Divisible by zero is not possible";

       try {
           result = fNumber/lNumber;
       }catch (ArithmeticException ex){
           System.out.println(str);
       }
    }
}
