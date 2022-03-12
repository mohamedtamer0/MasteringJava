package com.company;

public class OverloadMethods {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 8;
        int num3 = 3;

        int result = sum(num1, num2);
        System.out.println(result);
        int result2 = sum(num1, num2,num3);
        System.out.println(result2);
    }

    private static int sum(int n, int m) {
        return n + m;
    }

    private static int sum(int n, int m, int v) {
        return n + m + v;
    }
}
