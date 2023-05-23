package com.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    int marks;
    String grade;
}

     class TestStudent{
         public static void main(String[] args) {
             List<Student> al=new ArrayList<>();
             Student s1 = new Student();
             s1.id=1001;
             s1.name="Prasad";
             s1.marks=93;

             Student s2 = new Student();
             s2.id=1002;
             s2.name="Srinu";
             s2.marks=91;

             Student s3 = new Student();
             s3.id=1003;
             s3.name="Bala";
             s3.marks=78;

             Student s4 = new Student();
             s4.id=1004;
             s4.name="Naidu";
             s4.marks=98;

             al.add(s1);
             al.add(s2);
             al.add(s3);
             al.add(s4);

//           for (Student stu:al){
//               System.out.println(stu.id+" "+stu.name);
//
//           }

             al.stream().map(stu->{
                 if(stu.marks>90){
                     stu.grade="A";
                 }else {
                     stu.grade="B";
                 }
                 return stu;
             }).filter(stu->stu.grade.equals("A")).forEach(x->{
                 System.out.println(x.id);
                 System.out.println(x.name);
                 System.out.println(x.marks);
                 System.out.println("  ");
             });
         }
     }
