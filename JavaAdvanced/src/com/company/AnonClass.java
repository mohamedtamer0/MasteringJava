package com.company;

abstract class Emp {
    abstract void name();
}


public class AnonClass {
    public static void main(String[] args) {
        Emp obj = new Emp() {
            @Override
            void name() {
                System.out.println("Tamer");
            }
        };
        obj.name();
    }
}