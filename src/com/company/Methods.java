package com.company;

public class Methods {
    public static void main(String[] args) {
        doSomething();
        loopNum();
    }


    private static void loopNum() {
        int Nums = 15;
        for (int i = 0; i < Nums; i++) {
            System.out.println(i);
        }
    }

    private static void doSomething() {
        System.out.println("Mohamed Tamer");
    }
}
