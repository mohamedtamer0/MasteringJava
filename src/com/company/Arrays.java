package com.company;

import java.util.ArrayList;

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

        int [] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 30;
        System.out.println(numbers[1]);


        String[][] names2 = {{"Mohamed","Tamer"},{"Habiba","Tamer"}};
        System.out.println(names2[1][0] +" "+ names2[1][1]);

        ArrayList<String> names3 = new ArrayList<String>();
        names3.add("Mohamed");
        names3.add("Tamer");
        System.out.println(names3);
        System.out.println(names3.indexOf("Tamer"));

    }
}
