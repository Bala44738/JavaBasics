package com.Arrays;

public class PrintElementsInArray {

    public static void printArray(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9,4};
        printArray(arr);
    }
}
