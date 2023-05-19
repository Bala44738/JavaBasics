package com.Java8Features;

import java.util.function.Function;

public class SumOfNumbers {
    public static int sum(int[] arr, Function<Integer,Integer> fun){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum= sum+ fun.apply(arr[i]);

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9};
        Function<Integer,Integer> f1=(x)->x;
        int r1 = sum(arr,f1);
        System.out.println(r1);
    }
}
