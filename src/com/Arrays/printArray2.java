package com.Arrays;

public class printArray2 {

    public static void  printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
//            if (arr[i]%2==0&&arr[i]%3==0) {
            if(arr[i]%6==0){
                System.out.print(arr[i]);
                System.out.print(" ");
            }


        }
    }

    public static void main(String[] args) {
        int[] arr = {6,11,12,13,18,15,16,30};
        printArray(arr);
    }
}
