package com.statements;

public class FindSmallestNumber {

    public static void main(String[] args) {
        int a =10;
        int b =25;
        int c =20;

        if(a/b==0&&a/c==0){
            System.out.println("a is a small number");
        }else if(b/a==0&&b/c==0){
            System.out.println("b is a small number");
        }else{
            System.out.println("c is a small number");
        }

//        int small = 0;
//
//        if(a<b){
//            small=a;
//        }
//        if(c<a){
//            small = c;
//        }
//        if(b<c){
//            small = b;
//        }
//        System.out.println("small number is"+small);
    }
}
