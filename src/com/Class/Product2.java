package com.Class;

public class Product2 {

    int id;
    String name;


    public static Product2[] disply(Product2[] productArr){
        for(Product2 x: productArr){
            System.out.println(x.id);
            System.out.println(x.name);

        }
        return productArr;

    }

    public static void main(String[] args) {


     Product2 [] par = new Product2[4];
        Product2 p = new Product2();
        p.id = 3;
        p.name = "Balu";

        Product2 p2 = new Product2();
        p2.id=4;
        p2.name="Bunny";

        Product2 p3 = new Product2();
        p3.id=5;
        p3.name="Sai";

        Product2 p4 = new Product2();
        p4.id=6;
        p4.name="Roy";

        par[0]=p;
        par[1]=p2;
        par[2]=p3;
        par[3]=p4;
        disply(par);
    }
}
