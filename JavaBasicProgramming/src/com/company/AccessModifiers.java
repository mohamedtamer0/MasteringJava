package com.company;

public class AccessModifiers {
    private String name = "Tamer";
    protected String name2 = "Tamer";

    protected void show() {
        System.out.println("Tamer");
    }
}

class Main3 {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.show();
    }
}