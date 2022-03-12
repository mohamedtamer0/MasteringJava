package com.company;

public class IfIfElseElse {
    public static void main(String[] args) {
        int number = 25;
        if (number >= 1 && number <= 5) {
            System.out.println("yes number = 5");
        } else if (number >= 6 && number <= 15) {
            System.out.println("yes number in range (6-15)");
        } else {
            System.out.println("you are out of range");
        }
    }
}
