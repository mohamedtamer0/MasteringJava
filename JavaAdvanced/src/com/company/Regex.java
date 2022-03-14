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


        boolean m = Pattern.matches("[abc]","f");
        System.out.println(m);
        System.out.println("==================");
        boolean m2 = Pattern.matches("[a-z]","f");
        System.out.println(m2);
        System.out.println("==================");
        boolean m3 = Pattern.matches("[A-Z]","f");
        System.out.println(m3);


    }
}
