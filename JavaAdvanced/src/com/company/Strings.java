package com.company;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Mohamed Tamer";
        char[] c = {'T', 'a', 'm', 'e', 'r'};
        String s2 = new String(c);
        String s3 = new String("Mohamed");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        String s4 = "  Mohamed        ";
        System.out.println(s4.trim());
        System.out.println(s4.charAt(1));
        System.out.println(s4.length());

        int m = 20;
        String n = String.valueOf(m);
        System.out.println(n+10);
    }
}
