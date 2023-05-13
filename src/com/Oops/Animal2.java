package com.Oops;

public class Animal2 {
    public void f1() {
        System.out.println("Animal :");
    }
}
       class Humam extends Animal2{
    public void f1(String n){
        System.out.println("Human :");
    }
}
    class Female2 extends Humam{
        public void f1(String n) {
            System.out.println("Female :");
        }
    }
    class AppTest {
    public static void f2(Animal2 a){
        a.f1();
    }
    public static void f2(Humam h){
        h.f1();
    }
        public static void f2(Female2 f){
            f.f1();
        }
        public static void main(String[] args) {
            Female2 fm = new Female2();
           fm.f1();
        }


    }

