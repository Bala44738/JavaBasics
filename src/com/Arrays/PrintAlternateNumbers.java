package com.Arrays;

import java.util.Scanner;

import static com.Arrays.PrintElementsInArray.printArray;

public class PrintAlternateNumbers {

    public static void main(String[] args) {
        int arr[] = createArray();
        printArray(arr);

    }

    private static int[] createArray() {
        int i, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        count = sc.nextInt();  // Store the length of the array in count
        int a [] = new int[count];
        for ( i=0;i<count;i++){
            System.out.println("Enter the number"+(i+1));
            a[i]= sc.nextInt();   // Entered elements are stored in Aray
        }
        sc.close();

        System.out.print("\nOrginal array is :\t ");
        for(i=0;i<count;i++){
            System.out.println(a[i]+"\t");  // Print the orginal array

        }
        return a;
    }

    private static void printArray(int[] arr){
        System.out.println("\n\nAlternate Elements :\t");
        for (int i=0;i<arr.length;i+=2 )
            System.out.println(arr[i]+"\t");


    }
}
