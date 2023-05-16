package com.Arrays;

public class ArrayOrderLIFO {

    int arr[] = new int[5];
    int cursor=-1;

    public  int add(int a){
        cursor++;
        if (cursor<=arr.length-1) {
            arr[cursor] = a;
        }
        return a;
    }

    public  int remove() {
        int e = 0;
        if (cursor >= 0) {
            e = arr[cursor];
            cursor--;
        }
        return e;
    }
}

    class AppTest{
        public static void main(String[] args) {
            ArrayOrderLIFO ao = new ArrayOrderLIFO();
            int a1= ao.add(10);
            int a2=ao.add(20);
            int a3 =ao.add(30);
            int r1 = ao.remove();

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(r1);

        }
    }
