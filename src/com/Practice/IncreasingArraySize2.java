package com.Practice;

public class IncreasingArraySize2 {

    public static int[] createAndCopyArra(int arr[] ,int z){
        int newArr[] = new int[arr.length+z];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void display(int arr[]){
        for(int result : arr){
            System.out.println(result);
        }
        }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int index = 0;
        for(int i=0;i<10;i++){
            if (index== arr.length-1) {
                arr=createAndCopyArra(arr,5);
            }
            arr[index] = i;
            index++;

        }
        display(arr);
    }

}
