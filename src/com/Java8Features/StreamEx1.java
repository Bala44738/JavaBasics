package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
         al.add(5);
        al.add(11);
        al.add(10);
        al.add(15);
        al.add(23);
        al.add(40);
        al.add(41);

//        Function<Integer,Integer> mul=(x)->{
//            int y= x*2;
//            System.out.println(y);
//            return y;
//        };


        al.stream().forEach(x->{
            int z=x*2;
            System.out.println(z);
        });


        System.out.println("Print >150 numbers");
        al.stream().map(x->x*x).filter(x->x>150).forEach(x->{
            System.out.println(x);
        });

        System.out.println("Print even numbers");
        al.stream().filter(x->x%2==0).forEach(x-> System.out.println(x));

        System.out.println("Print odd numbers");
        al.stream().filter(x->x%2==1).forEach(x-> System.out.println(x));


        // Print prime numbers
        System.out.println("Print prime numbers");
        al.stream().map((x)->{
            int count = 0;
           for(int i=1;i< al.size();i++){
               if (x%i==0) {
                   count++;
               }

           }
           if (count==2){
               return x;
           }
            return 0;
        }).forEach(x-> System.out.println(x));

    }
}
