package com.statements;

public class LCMOfNumbers {

    public static void main(String[] args) {
        int a =5;
        int b=7;
        int lcm=(a>b) ? a:b;
        while(true){
            if(lcm%a==0&&lcm%b==0){
                System.out.println("lac of"+a+"&"+b+"is"+lcm);
                break;
            }
            lcm++;
        }
    }
}
