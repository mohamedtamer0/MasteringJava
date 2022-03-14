package com.company;

public class Equal_oper {
    public static void main(String[] args) {
        String s5 = "Mohamed";
        String s6 = "Mohamed";
        String s8 = "Tamer";
        String s7 = new String("Mohamed");

        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareTo(s8));
        System.out.println(s8.compareTo(s5));
        System.out.println(s5.compareToIgnoreCase(s6));


    }
}
