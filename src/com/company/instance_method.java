package com.company;

public class instance_method {
    public static void main(String[] args) {
        Mohamed ins = new Mohamed();
        ins.firsName();

        Mohamed.lastName();
    }
}


class Mohamed{
    public void firsName() {
        System.out.println("My Name Is Mohamed");
    }

    public static void lastName() {
        System.out.println("My Name Is Tamer");
    }
}