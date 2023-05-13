package com.Practice;

public class DuplicatesCheck1 {

    public static boolean hasDuplicates(int[] arr) {
        boolean hasDuplicates = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    hasDuplicates = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[index] = arr[i];
                index++;
            }
        }
        display(arr);
        return hasDuplicates;
    }
    public static void display(int[] arr) {
        for (int results: arr) {
            System.out.println(results);
        }
    }
    public static void main(String[] args) {
        int arr [] ={5,5,7,7,8,9,10,11,12,12};

        hasDuplicates(arr);
    }
}
