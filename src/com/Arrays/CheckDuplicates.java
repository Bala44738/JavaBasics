package com.Arrays;

public class CheckDuplicates {


        public static void main(String[] args) {
            int arrr [] ={5,5,6,7,7,8,9,10,11,12,12};
            int in=0;
            for(int i=0;i< arrr.length;i++){
//                int a=arrr[i];
                boolean isElementPresent =  isElementExists(arrr, 7);

                if(!isElementPresent){
                    arrr[in] = i;
                    in++;
                }

            }
            display(arrr);
        }

        private static boolean isElementExists(int[] arr, int x) {
            for (int i =0 ;i <arr.length; i++){
                if(arr[i] == x){
                    return true;
                }
            }
            return false;
        }

        private static void display(int[] arr) {
            for (int results: arr) {
                System.out.println(results);
            }
        }

        public static int[] createAndCopyArr(int[] arr, int z){
            int newArr [] = new int[arr.length + z];
            for (int i=0;i< arr.length;i++){
                newArr[i]=arr[i];
            }
            return newArr;
        }
    }


