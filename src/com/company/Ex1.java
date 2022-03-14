package com.company;

public class Ex1 {
    private String name = "Mohamed";
    private String lastName = "Tamer";
    private int age = 25;

    public Ex1(String n, String ln, int a) {
        System.out.println("New Const");
        name = n;
        lastName = ln;
        age = a;
    }

    public void nyName() {
        System.out.println(name + " " + lastName);
    }

    public void myAge() {
        System.out.println(age);
    }
}


class TestEx1 {
    public static void main(String[] args) {
        Ex1 obg = new Ex1("Mohamed","Tamer",25);
        obg.nyName();
        obg.myAge();
    }
}
