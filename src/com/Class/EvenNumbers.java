package com.Class;

public class EvenNumbers {

    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
        }
        return false;
    }

    public static int[] getEven(int arr[]){
    int outArr[]= new int[arr.length];
    int i=0;
    for(int j=0;j< arr.length;j++){
        int x =arr[j];
        boolean isEn = isEven(x);
        if (isEn) {
            outArr[i] = x;
            i++;
        }

    }

        return outArr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
                int[] result = getEven(arr);
        for(int output:result){
            System.out.println(output);

        }
    }
}
