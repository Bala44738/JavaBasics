package com.Class;

public class Product {
    int id;
    String name;


      // Called Function
    public static void display(Product x){

        System.out.println(x.id);
        System.out.println(x.name);
        x.name = "ABC";

    }
   // Calling function
    public static void main(String[] args) {
        Product p=new Product();
        p.id= 101;
        p.name="Bala";
        display(p);


        Product p1 = new Product();
        p1.id=102;
        p1.name="Babu";
        display(p1);
//        System.out.println(" ");
        System.out.println(p.name);
        System.out.println(p1.name);

    }
}