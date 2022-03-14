package com.company;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Mohamed";
        String s2 = "Tamer";
        String s3  = new String("Mohamed");
        String s4 = new String("mohamed");

        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
