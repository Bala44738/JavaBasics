package com.Exception;

public class Exception1 {

    public static  String getName(String n) throws Exception {
           try {
               return n.toUpperCase();
           }catch (Exception e){
//               if(n == null){
//                   return "";
//               }
               throw new Exception("Invalid value please enter valid value.");
           }
    }

    public static String f1(String n) throws Exception{
        System.out.println("Name From F1::"+ n);
        return getName(n);
    }
    public static void main(String[] args) throws Exception {
        String name = "balababu";
      String output = f1(name);
        System.out.println(output);
    }
}
