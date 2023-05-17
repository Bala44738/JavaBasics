package com.Arrays;

 class Node {
    int data;
    Node nextNode;
}
public class MyList {
         Node head, temp;
         public void add(int a) {
             Node n = new Node();
             n.data = a;
             if (head == null) {
                 head = n;
                 temp = n;
             } else {
                 temp.nextNode = n;
                 temp = n;
             }
             Node temp = n;
             while (temp != null) {
                 System.out.println(temp.data);
                 temp = temp.nextNode;
             }
         }
     }
     class TestApp{
         public static void main(String[] args) {
             MyList ml = new MyList();
             ml.add(10);
             ml.add(20);
             ml.add(30);
             ml.add(40);
             ml.add(50);
             ml.add(60);
             ml.add(70);
             ml.add(80);
         }
     }