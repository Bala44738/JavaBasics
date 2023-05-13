package com.Loops;

public class PascalTriangle {

    public static void main(String[] args) {
        int r,k, number = 1, j ;
        r=4;
        for(int i = 0;i<r;i++){
            for(k=r;k>i;k--){
                System.out.print(" ");

            }
            number = 1;
            for(j=0;j<=r;j++){
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);

            }
            System.out.println();
        }

    }
}
