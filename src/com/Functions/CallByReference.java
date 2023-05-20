package com.Functions;

class Product {
    int id;
    String name;
    float price;
}

public class CallByReference {
    public static void main(String[] args) {
        Product pro = new Product();
        pro.id = 12;
        pro.name = "Nokia";
        pro.price = 3.4f;

        printProduct(pro);
        changeProductValues(pro);
        printProduct(pro);
        makeProductNull(pro);
        printProduct(pro);
    }

    public static void printProduct(Product pro) {
        System.out.println("printProduct() -> " + pro.id + " " + pro.name + " " + pro.price);
    }
    public  static void changeProductValues(Product pro) {
        pro.id = 14;
        pro.price = 3000.50f;
    }
    public static void makeProductNull(Product pro) {
        pro = null;
    }
}