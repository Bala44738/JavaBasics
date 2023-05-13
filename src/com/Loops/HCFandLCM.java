package com.Loops;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {

        int a,b,x,y,t,lcm,hcf;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        x = sc.nextInt(); // Store the first value in x
        y = sc.nextInt();    // Store the second value in y

        a=x;
        b=y;

        while(b!=0){
            t=b;
            b=a%b;
            a=t;
        }
        hcf=a;
        lcm=(x*y)/hcf;

        System.out.println("lCM of the two numbers = "+lcm);
        System.out.println("HCF of the two numbers = "+hcf);
        sc.close();

    }
}
