package com.company;

public class Loops {

    public static void main(String[] args) {
        String[] names = {"Mohamed", "Tamer", "Ahmed", "Ali", "Osama"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        //ForEach
        System.out.println("===========ForEach");
        for (String name : names) {
            System.out.println(name);
        }


        //While
        System.out.println("=============While");
        int counter = 0;
        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }


        //DoWhile
        System.out.println("=============DoWhile");
        int counter2 = 0;
        do {
            System.out.println(names[counter2]);
            counter2++;
        } while (counter2 < names.length);
    }
}
