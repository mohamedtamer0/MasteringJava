package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern patt = Pattern.compile(".m.");
        Matcher mat = patt.matcher("bmw");
        boolean bo = mat.matches();
        System.out.println(bo);


        System.out.println("==================");

        boolean bo2 = Pattern.compile(".m.").matcher("bmw").matches();
        System.out.println(bo2);

        boolean bo3 = Pattern.matches(".m.", "bmw");
        System.out.println(bo3);

        System.out.println("==================");


        boolean m = Pattern.matches("[abc]", "f");
        System.out.println(m);
        System.out.println("==================");
        boolean m2 = Pattern.matches("[a-z]", "f");
        System.out.println(m2);
        System.out.println("==================");
        boolean m3 = Pattern.matches("[A-Z]", "f");
        System.out.println(m3);

        System.out.println("==================");

        boolean v = Pattern.matches("[A-F&&[def]]", "F");
        boolean z = Pattern.matches("[a-z&&[^fd]]", "d");
        System.out.println(v);
        System.out.println(z);



        System.out.println("==================");



        boolean p = Pattern.matches("[muh]?","m");
        boolean p1 = Pattern.matches("[muh]?","mmm");
        boolean p2 = Pattern.matches("[muh]?","muh");
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("==================");

        boolean p3 = Pattern.matches("[muh]+","m");
        boolean p4 = Pattern.matches("[muh]+","mmm");
        boolean p5 = Pattern.matches("[muh]+?","muhm");
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
