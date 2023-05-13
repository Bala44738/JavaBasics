package com.Loops;

public class SumOfGivenNumber {

    public static void main(String[] args) {
        int n, m,  sum = 0;
        m=456;
        while(m>0){
            n = m%10;
            sum=sum+n;
            m=m/10;
        }
        System.out.println("Sum of digits =" +sum);
    }
}
