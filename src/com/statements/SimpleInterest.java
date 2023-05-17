package com.statements;

public class SimpleInterest {
    public static void main(String[] args) {
        int principle = 100000;
        float rate = 2;
        float time = 5;
        float SI = principle*rate*time/100 ;
        System.out.println("The Simple Interst Is "+SI);
    }
}
