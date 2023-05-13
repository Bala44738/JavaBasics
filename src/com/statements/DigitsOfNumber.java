package com.statements;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer");

        int num = sc.nextInt();

        ArrayList<Integer> digitList = new ArrayList<>();

        while (num>0){
            int uniDisit = num%10;
            digitList.add(0,uniDisit);
            num = num/10;

        }
        System.out.println("The digits of the given number :");
        for(int result:digitList){
            System.out.println(result+" ");
            sc.close();

        }
    }
}
