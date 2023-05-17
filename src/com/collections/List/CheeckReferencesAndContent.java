package com.collections.List;

public class CheeckReferencesAndContent {
    public static void main(String[] args) {
        String s1= "Balu";
        String s2 = "Balu";
        String s3 = new String("Balu");

        if ( s1.equals(s2) ) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
