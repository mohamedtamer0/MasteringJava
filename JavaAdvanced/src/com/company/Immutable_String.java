package com.company;

public class Immutable_String {
    public static void main(String[] args) {
        String s = "Mohamed";

        s = s.concat(" Tamer");
        System.out.println(s);
        s = s.concat(" Mohamed");
        System.out.println(s);
    }
}
