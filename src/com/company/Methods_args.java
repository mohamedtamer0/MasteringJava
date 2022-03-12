package com.company;

public class Methods_args {
    public static void main(String[] args) {
        Person person = new Person();
        person.printName("Mohamed Tamer");
    }
}

class Person {
    public void printName(String name) {
        System.out.println(name);
    }
}
