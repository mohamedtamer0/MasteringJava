package com.company;

public class S_append {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Mohamed");
        name.append(" Tamer");

        System.out.println(name);

        name.insert(0,"MR: ");
        System.out.println(name);
    }
}
