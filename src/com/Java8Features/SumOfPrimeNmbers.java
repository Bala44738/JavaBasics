package com.Java8Features;

import java.util.function.Function;

public class SumOfPrimeNmbers {
    public static int sum(int[] arr, Function<Integer,Integer> fun){
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum = sum+ fun.apply(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr [] = {2,3,5,7,9,10,11,12};
        Function<Integer,Integer> sumPrime=(x)->{
            int count = 0;
            for(int i =1;i<=x;i++){
                if(x%i==0){
                    count++;
                }
            }
            if (count ==2) {
                return x;
            }
            return 0;
        };
        int r1=sum(arr,sumPrime);
        System.out.println(r1);
    }
}
