package com.company;

import java.util.StringTokenizer;

public class S_append {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Mohamed");
        name.append(" Tamer");

        System.out.println(name);

        name.insert(0, "MR: ");
        System.out.println(name);
        System.out.println(name.capacity());

        StringBuilder name2 = new StringBuilder("Mohamed");
        StringBuilder name3 = new StringBuilder("Mohamed");
        name2.insert(7, " Tamer");
        System.out.println(name2);

        name3.replace(0, 4, "Ah");
        System.out.println(name3);

        StringTokenizer str = new StringTokenizer("My Name is Mohamed ,Tamer");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        StringTokenizer str2 = new StringTokenizer("My Name is Mohamed ,Tamer");
        System.out.println(str2.nextToken(","));


        String myName = "Tamer";
        String s1 = String.format("Name is %s", myName);
        String s2 = String.format("Value is %f", 32.5554585);
        String s3 = String.format("Value is %44.11f", 32.54);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
