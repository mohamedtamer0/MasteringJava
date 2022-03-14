package com.company;

public class Ex1 {
    private String name = "Mohamed";
    private String lastName = "Tamer";
    private int age = 25;

    public Ex1(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        Ex1 obg = new Ex1("Mohamed", "Tamer", 25);
        obg.nyName();
        obg.myAge();
    }
}
