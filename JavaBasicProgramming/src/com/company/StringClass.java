package com.company;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Mohamed Tamer";
        String s2 = new String("Mohamed Tamer");
        System.out.println(s2);
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("They Match!");
        } else {
            System.out.println("No Match !");
        }

        StringBuilder mn = new StringBuilder(s1);
        mn.append(" Mohamed");
        System.out.println(mn);

        System.out.println(mn.length());
        int position = mn.indexOf("Tamer");
        System.out.println(position);
    }
}
