package com.Arrays;

public class PrintElementsInArray3 {

    public static void getNumbers(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");

        }

    }

    public static void main(String[] args) {
        int arr [] ={2,3,5,7,11,13,17,19,23,29,31};
        getNumbers(arr);
    }
}
