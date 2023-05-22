package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndAvoidDup {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(5);
        al.add(8);
        al.add(9);
        al.add(7);

        List<Integer> uniq=new ArrayList<>();


        al.stream().map((x)->x*x).filter((x)->{
            if(!uniq.contains(x)){
                uniq.add(x);
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(uniq);
    }
}
