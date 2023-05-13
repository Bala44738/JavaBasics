package com.Exception;

public class ArrayExcepton {

    public static String[] getData(String[] arr){

//        arr = new String[9];
       try {
           System.out.println(arr[9]);
       }catch (ArithmeticException e){
           System.out.println("ArithmeticException");

       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Enter the data with in given size");

       }
        return arr;
    }

    public static void main(String[] args) {

        String arr []= new String[5];
        getData(arr);
    }
}
