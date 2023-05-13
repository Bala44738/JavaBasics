package com.Class;

public class Bus {
    int number;
    String name;
    int startTime;


    public static Bus[] filteredByTime(Bus[] arr){
        Bus [] busOtput = new Bus[2];
        int x=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i].startTime>=6&&arr[i].startTime<=9) {
                busOtput[x] = arr[i];
                x++;
            }

        }

        return busOtput;
    }

    public static void main(String[] args) {
        Bus [] arr= new Bus[4];
        Bus b1 = new Bus();
        b1.number=123;
        b1.name="Kaveri traves";
        b1.startTime=7;

        Bus b2 = new Bus();
        b2.number=345;
        b2.name="Prime traves";
        b2.startTime=5;

        Bus b3 = new Bus();
        b3.number=567;
        b3.name="Balu traves";
        b3.startTime=4;

        Bus b4 = new Bus();
        b4.number=789;
        b4.name="Sri traves";
        b4.startTime=9;

        arr[0]=b1;
        arr[1]=b2;
        arr[2]=b3;
        arr[3]=b4;

        filteredByTime(arr);

        Bus [] result=filteredByTime(arr);

        for(Bus bu:result){
            System.out.println(bu.number+" "+bu.name+" "+"Start time = "+bu.startTime);

        }


    }
}
