package com.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {
    public static void main(String[] args) {
        Set<Employee> emp = new HashSet<>();

        Employee e1 = new Employee();
        e1.id=1001;
        e1.name="Deepthi";
        e1.jobRole="Java Developer";


        Employee e2 = new Employee();
        e2.id=1002;
        e2.name="    Sai";
        e2.jobRole="Full stack developer";

        Employee e3 = new Employee();
        e3.id=1003;
        e3.name="Shanker ";
        e3.jobRole="Back end developer";

        Employee e4 = new Employee();
        e4.id=1001;
        e4.name="Deepthi";
        e4.jobRole="Java Developer";


        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);

        if (e1.equals(e4)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        for(Employee e : emp){
            System.out.println(e.getId()+" "+e.getName()+"      "+e.getJobRole());
        }

    }
}
