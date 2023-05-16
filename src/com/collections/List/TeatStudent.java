package com.collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TeatStudent {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        Student s1 = new Student();
        s1.id=1001;
        s1.name= "Balu";
        s1.age=26;

        Student s2 = new Student();
        s2.id=1002;
        s2.name="Sai";
        s2.age=25;

        Student s3 = new Student();
        s3.id=1003;
        s3.name="Shanker teja";
        s3.age=27;

        Student s4 = new Student();
        s4.id=1001;
        s4.name= "Balu";
        s4.age=26;

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        if (s1.equals(s4)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        System.out.println("*****************8**************");

        for (Student l : st){
            System.out.println(l.getId()+" "+l.getName()+" "+l.getAge());
        }

    }
}
