package com.Loops;

public class AmstrongNumber {
    public static void main(String[] args) {

        int number ,orginalNumber =371,remainder,result = 0;

        number = orginalNumber; //Storing the orginal number in another variable

        while (number!=0){
            remainder = number%10;  // Calculating madulue value
            result += Math.pow(remainder,3);
            number /=10;

        }

        if(result==orginalNumber){
            System.out.println(orginalNumber+" Is a Amstrong number");

        }else {
            System.out.println(orginalNumber+" Is not a Amstrong number");
        }

    }
}
