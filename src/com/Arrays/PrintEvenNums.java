package com.Arrays;

import java.util.Scanner;

public class PrintEvenNums {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};//initialization of elements in an array
        printEven(arr);
    }

    public static void printEven(int arr[]){
        for (int i = 0; i<=arr.length-1; i++) {
            if (arr[i] % 2 == 0)//condition to find out the even numbers in an array
                System.out.println(arr[i]+"is Even Number");//printing the even numbers in the given array
        }
    }

}
