package com.Class;

public class MultiplyWith2 {

    public static int[] mulltiply(int[] arr){
        int multArr[] = new int[arr.length];
        for(int i =0;i< arr.length;i++){

            multArr[i] =arr[i]*2;

        }
        return multArr;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,24,12};
       mulltiply(arr);
        int []result= mulltiply(arr);
        for(int x:result){
            System.out.println(x);

        }
    }
}
