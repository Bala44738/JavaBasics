package com.Class;

public class Student {
    int id;
    int marks;
    String name;


    public static Student[] filterByMarks(Student[] arr){
        Student filterArr[] = new Student[2];
        int x=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i].marks>90) {
                filterArr[x]=arr[i];
                x++;

            }


        }


        return filterArr;
    }

    public static void main(String[] args) {
        Student [] arr = new Student[3];
        Student s1 = new Student();
        s1.id=1;
        s1.marks=96;
        s1.name="deepak";

        Student s2 = new Student();
        s2.id=2;
        s2.marks=81;
        s2.name="Deepthi";

        Student s3 = new Student();
        s3.id=3;
        s3.marks=98;
        s3.name="Roy";

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        filterByMarks(arr);
        Student [] filter=filterByMarks(arr);
        for(Student result :filter){
            System.out.println(result.id+"  "+result.name+"  "+ result.marks);

        }
    }
}
