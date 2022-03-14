package com.company;

public class Arrays {
    public static void main(String[] args) {
        String[] s = new String[4];
        for (String string : s) {
            System.out.println(string);
        }


        int [] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        String[] names = {"Mohamed","Tamer","Mohand"};
        for (String string:names) {
            System.out.println(string);
        }
    }
}
