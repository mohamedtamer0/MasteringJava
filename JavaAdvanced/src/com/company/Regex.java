package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern patt = Pattern.compile(".m.");
        Matcher mat = patt.matcher("bmw");
        boolean bo = mat.matches();
        System.out.println(bo);
    }
}
