package com.company;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s = in.nextLine();
        System.out.println(s);
        System.out.println("Enter your age:");
        int num = in.nextInt();
        System.out.println(num);
        in.close();
    }
}
