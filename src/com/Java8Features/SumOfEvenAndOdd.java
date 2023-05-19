package com.Java8Features;

import java.util.function.Function;

public class SumOfEvenAndOdd {
    public static int sum(int[] arr,Function<Integer,Integer> fun){

        int sum = 0;
        for(int i =0;i< arr.length;i++){
            sum=sum+ fun.apply(arr[i]);

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,8,9,10,11,12};
        Function<Integer,Integer> sumEven= (x)->{
            if (x%2==0) {
                return x;
            }
            return 0;
        };
        int r1 =sum(arr,sumEven);
        System.out.println(r1);
    }
}
