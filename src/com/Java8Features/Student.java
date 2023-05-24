package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable{
    int id;
    String name;
    int marks;
    String grade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && marks == student.marks && Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, marks, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s= (Student) o;
//        return Integer.compare(this.marks,s.marks);

        return this.name.compareTo(s.name);
    }
}

