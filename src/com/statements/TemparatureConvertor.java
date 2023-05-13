package com.statements;

import java.util.Scanner;

public class TemparatureConvertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputType;
        int outputType;
        float inputValue;
        float returnValue;

        System.out.println("Input type (F/c/k): ");
        inputType = sc.next().charAt(0);
        System.out.println("Output type (F/C/K): ");
        outputType= sc.next().charAt(0);
        System.out.println("Temparature ");
        inputValue = sc.nextFloat();

        switch (inputType){
            case 'F':
                inputValue= fToC(inputValue);
                break;
            case 'C':
                break;
            case 'K':
                inputValue = fToC(kToF(inputValue));
                break;
            default:
//                system.exit(1);
        }
        switch (outputType){
            case 'F':
                inputValue=kToF(cToK(inputValue));
                break;
            case 'C':
                break;
            case 'K':
                inputValue = cToK(inputValue);
            default:
//                system.exit(1);
        }
        System.out.println(inputValue);
    }
    public static float fToC(float fVal){

        return ((fVal-32.0f)*5.0f)/9.0f;
    }
    public static float kToF(float kVal){
        return (((kVal-273.15f)*9.0f)/5.0f)+32.0f;
    }
    public static float cToK(float cVal){
        return cVal+273.15f;
    }

}
