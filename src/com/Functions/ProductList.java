package com.Functions;

import java.util.Scanner;

class Product1 {
    int id;
    String name;
    float price;
 }

public class ProductList {

    public static void main(String[] args) {
        Product1 prdct[] = new Product1[2];
        // create first product
        Product1 pro = new Product1();
        pro.id = 2;
        pro.name = "Nokia 6";
        pro.price = 7000.50f;

        Product1 pro1 = new Product1();
        pro1.id = 4;
        pro1.name = "Samsung";
        pro1.price = 9000.50f;

        prdct[0] = pro; // assign product to array zero location
        prdct[1] = pro1; // assign product to array first location

        printProducts(prdct);

        prdct = getProducts();
        printProducts(prdct);
    }

    private static Product1[] getProducts() {
        Product1 products[] = new Product1[2];
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter product Id:");
            int productId = scaner.nextInt();
            System.out.println("Enter product Name:");
            String productName = scaner.next();
            System.out.println("Enter product Price:");
            float productPrice = scaner.nextFloat();
            Product1 pro = new Product1();
            pro.id = productId;
            pro.name = productName;
            pro.price = productPrice;
            products[i] = pro;
        }
        scaner.close();
        return products;
    }

    private static void printProducts(Product1[] p) {
        for (int index = 0; index < p.length; index++) {
            System.out.println(p[index].id + " " + p[index].name + " " + p[index].price);
        }
    }

}