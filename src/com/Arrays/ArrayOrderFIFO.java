package com.Arrays;

public class ArrayOrderFIFO {
    int arr[] = new int[5];
    int cursor = -1;

    public int add(int a) {
        cursor++;
        if (cursor <= arr.length) {
            arr[cursor] = a;
        }
        return a;
    }

    public int remove() {
        int e = 0;
        int r1 []= new int [arr.length];
        if (cursor >= 0) {
            e = arr[cursor];
            r1=copy(arr,cursor);
//            arr[cursor] = 0;
            cursor--;
        }
        return e;
    }
    public static int[] copy(int arr[], int cursor) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
        return arr;
    }
}
class AppTest1 {
    public static void main(String[] args) {
        ArrayOrderFIFO ao = new ArrayOrderFIFO();
        int a1 = ao.add(10);
        int a2 = ao.add(20);
        int a3 = ao.add(30);
        int a4 = ao.add(40);
        int a5 = ao.add(50);
        int r1[] = new int[ao.remove()];
        for(int r2:r1){
            if(r2!=0){

            }

        }
    }

}