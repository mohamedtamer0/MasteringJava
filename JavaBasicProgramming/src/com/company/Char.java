package com.company;

public class Char {
    public static void main(String[] args) {
        char a1 = '1';
        char a2 = '2';
        char a3 = '3';
        char dollar = '\u0024';
        System.out.println(dollar);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        char v1 = 'a';
        char v2 = 'c';
        System.out.println(Character.toUpperCase(v1));
        System.out.println(Character.toUpperCase(v2));

        System.out.println("Mohamed \"Tamer\"");
        System.out.println("Mohamed \'Tamer\'");
        System.out.println("Mohamed \t Tamer");
        System.out.println("Mohamed \n Tamer");
        System.out.println("Mohamed \f Tamer");
        System.out.println("Mohamed \\ Tamer");
    }
}
