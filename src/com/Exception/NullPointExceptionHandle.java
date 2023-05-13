package com.Exception;

public class NullPointExceptionHandle {

    public static String getName(String n) throws Exception {
        try {
            n = n.toUpperCase();
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception("Invalid name. Please enter a valid name.");
        }

        return n;
    }

    public static void f1() throws Exception {
        try {
            String s = getName("Balu");
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        f1();

    }
}
