package com.company;

public class Booleans {
    public static void main(String[] args) {

        boolean m1 = true;
        boolean m2 = false;

        System.out.println(m1);
        System.out.println(m2);

        boolean m3 = !m1;
        System.out.println(m3);

        int a = 0;
        boolean m4 = (a != 0);
        System.out.println(m4);

        String v = "true";
        boolean m5 = Boolean.parseBoolean(v);
        System.out.println(m5);
    }
}
