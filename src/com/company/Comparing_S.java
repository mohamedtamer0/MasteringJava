package com.company;

public class Comparing_S {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
//        if (s1 == s3) {
//            System.out.println("They match");
//        } else {
//            System.out.println("No match");
//        }

        if (s3.equals(s4)) {
            System.out.println("They match");
        } else {
            System.out.println("No match");
        }
    }
}
