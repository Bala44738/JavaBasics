package com.Practice;

public class ApResults {

    int rollNumber;
    String name;
    int marks;

    public static ApResults[] qualifiedList(ApResults[] arr){
        ApResults qualified[] = new ApResults[3];

        for (int i=0;i< arr.length;i++){
            int x=0;
            if (arr[i].marks>150) {
                qualified[x]=arr[i];
                x++;
            }

        }

        return qualified;
    }

    public static void main(String[] args) {
        ApResults arr[] = new ApResults[4];
        ApResults ap1= new ApResults();
        ap1.rollNumber=1001;
        ap1.name="Sai";
        ap1.marks=178;

        ApResults ap2= new ApResults();
        ap2.rollNumber=1002;
        ap2.name="Teja";
        ap2.marks=172;

        ApResults ap3= new ApResults();
        ap3.rollNumber=1003;
        ap3.name="Balababu";
        ap3.marks=148;

        ApResults ap4= new ApResults();
        ap4.rollNumber=1004;
        ap4.name="Deepyhi";
        ap4.marks=186;

        arr[0]=ap1;
        arr[2]=ap2;
        arr[1]=ap3;
        arr[3]=ap4;
        qualifiedList(arr);

        ApResults results []= qualifiedList(arr);

        for(ApResults apr:results){
            System.out.println(apr.rollNumber+" "+apr.name+" "+apr.marks);

        }
    }
}
