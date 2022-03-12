package com.company;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        int original_result = result;

        result = result - 1;
        System.out.println(result);
        original_result = result;

        result = result * 2;
        System.out.println(result);
        original_result = result;

        result = result / 2;
        System.out.println(result);
        original_result = result;


        result = result + 8;
        System.out.println(result);
        original_result = result;


        result = result % 7;
        System.out.println(result);

    }
}
