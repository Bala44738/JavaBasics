package com.Oops;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Human h = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender");
        String gender = sc.next();
        if (gender.equalsIgnoreCase("male")) {
            h = new Male();
            h.Welcome();
        } else {
            h = new Female();
            h.Welcome();
        }
    }
}
