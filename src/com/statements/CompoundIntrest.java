package com.statements;

public class CompoundIntrest {

    public static void main(String[] args) {
        int p=2000;
        int t= 5;
        float r= 0.08f;
        int n= 12;
        double amount = p*Math.pow(1+(r/n),n*t);
        System.out.println("Amount ofter 5 years="+amount);

        double inrest = amount - p;
        System.out.println("Inrest ofter 5 years="+inrest);

    }
}
