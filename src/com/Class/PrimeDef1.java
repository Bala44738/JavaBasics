package com.Class;

public class PrimeDef1 {

    public static boolean isPrime(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        return count == 2;
    }


    public static int[] getPrime(int arr[]){
        int outArr[] = new int[arr.length];
        int i=0;
        for(int index = 1;index<arr.length;index++) {
            int x = arr[index];
            boolean isp = isPrime(x);
            if (isp) {
                outArr[i] = x;
                i++;
            }
        }
        return outArr;
    }


    public static void main(String[] args) {
//        boolean result = isPrime(11);
//
//        System.out.println(result);

        int arr[] = {2,5,4,7,9,15,25};
        int outputArr [] = getPrime(arr);
        for(int x:outputArr){
            System.out.println(x);
        }
    }
}
