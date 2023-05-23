package com.Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student2 {
    int id;
    String name;
    int marks;
    String grade;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
    public int getMarks() {
        return marks;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student2 student2 = (Student2) o;
//        return id == student2.id && marks == student2.marks && Objects.equals(name, student2.name) && Objects.equals(grade, student2.grade);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, marks, grade);
//    }
}
    class TestStudent2{
        public static void main(String[] args) {
            List<Student2> al= new ArrayList<>();
            Student2 s1 = new Student2();
            s1.id=1001;
            s1.name="Prasad";
            s1.marks=93;

            Student2 s2 = new Student2();
            s2.id=1002;
            s2.name="Srinu";
            s2.marks=91;

            Student2 s3 = new Student2();
            s3.id=1003;
            s3.name="Bala";
            s3.marks=78;

            Student2 s4 = new Student2();
            s4.id=1004;
            s4.name="Naidu";
            s4.marks=98;

//            Student2 s5 = new Student2();
//            s5.id=1001;
//            s5.name="Prasad";
//            s5.marks=93;

            al.add(s1);
            al.add(s2);
            al.add(s3);
            al.add(s4);
//            al.add(s5);

             // Function interface
            Function<Student2,Student2> gradeFun = stu->{
                if (stu.getMarks()>90) {
                    stu.grade="A";
                }  else {
                    stu.grade="B";
                }
                return stu;
            };

            // Predicate
            Predicate<Student2> gradePredi = x->x.getGrade().equals("A");

            // Consumer
            Consumer<Student2> printConsumer = x-> System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks()+" "+x.getGrade());

            // Comparator
//            Comparator<Student2> setfun= (x,y)->{
//                if (x.getMarks()>y.getMarks()) {
//                  return 1;
//                }
//
//                return -1;
//            };

            Comparator<Student2> setfun= (x,y)->{
               return x.getName().compareTo(y.getName());
            };

            al.stream().map(gradeFun).filter(gradePredi).sorted(setfun).forEach(printConsumer);

        }

    }