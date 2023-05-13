package com.Class;

public class DummyOrNot {

    public static boolean dummy(int arr[]){

        for(int i = 0;i<  arr.length;i++){
            if(arr[i] !=0){
                return false;
            }
        }


        return true;
    }

    public static int countNum(int[] arr1){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,};
        boolean i = dummy(arr);
        System.out.println(i);

        int arr1[] ={0,8,0,7,5,4,0,3};
        int result = countNum(arr1);
        System.out.println(result);
    }
}
