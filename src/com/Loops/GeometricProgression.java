package com.Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start value of the series : ");
        int a = scanner.nextInt();
        System.out.println("Enter the common ratio : ");
        int r = scanner.nextInt();
        System.out.println("Enter the value (N) for the series : ");
        int N = scanner.nextInt();
        
        System.out.print(a+" ");
        for(int i=1;i<=N;i++){
            a = a * r;
            System.out.print(a+" ");
        }
        scanner.close();
    }

}
