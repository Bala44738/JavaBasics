package com.Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent3 {

    public static void main(String[] args) {

        List<String> nmList = new ArrayList<>();
        nmList.add("Infosys");
        nmList.add("Microsoft");
        nmList.add("Apple");
        nmList.add("Google");

        Collections.sort(nmList);
        System.out.println(nmList);
        System.out.println();

        List<Student> al = new ArrayList<>();
        Student s1 = new Student();
        s1.id = 1001;
        s1.name = "Prasad";
        s1.marks = 93;

        Student s2 = new Student();
        s2.id = 1002;
        s2.name = "Srinu";
        s2.marks = 91;

        Student s3 = new Student();
        s3.id = 1003;
        s3.name = "Bala";
        s3.marks = 78;

        Student s4 = new Student();
        s4.id = 1004;
        s4.name = "Naidu";
        s4.marks = 98;

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

       // Function interface
//        Function<Student,Student> mapfun = (x)->{
//            if (x.getMarks()>90) {
//                x.grade="A";
//            }else {
//                x.grade="B";
//            }
//            return x;
//        };

       // Predicate
//        Predicate<Student> filtrPre = x->x.getGrade().equals("A");

        // Comparable
//        Comparable<Student> compsrt = x->{
//
//            return 0;
//        };

        // Comparator
//        Comparator<Student> compsrt = (x,y)->{
//            return x.getName().compareTo(y.getName());
//        };

        // Consumer
        Consumer<Student> cunforech = x-> System.out.println(x.getId()+" "+x.getName()+
                " "+x.getMarks());

        System.out.println("Sorted based on marks: ");
        al.stream()/*.map(mapfun).filter(filtrPre)*/.sorted().forEach(cunforech);
        System.out.println();

        System.out.println("Sorted bsed on id: ");
        al.stream().sorted(Student::compareId).forEach(cunforech);
        System.out.println();

        System.out.println("Sorted based on names: ");
        al.stream().sorted(Student::compareName).forEach(cunforech);
    }
}
