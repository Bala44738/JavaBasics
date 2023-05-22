package com.Java8Features;

import java.util.stream.IntStream;

public class StreamsArray {
    public static void main(String[] args) {
        int arr [] = {5,6,7,8,9,10,11};
        IntStream.range(0, arr.length).filter(i->(arr[i]%2)==0).forEach(x-> System.out.println(arr[x]));
    }
}
