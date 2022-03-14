package com.company;

public class S_append {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Mohamed");
        name.append(" Tamer");

        System.out.println(name);

        name.insert(0,"MR: ");
        System.out.println(name);
        System.out.println(name.capacity());

        StringBuilder name2 = new StringBuilder("Mohamed");
        StringBuilder name3 = new StringBuilder("Mohamed");
        name2.insert(7," Tamer");
        System.out.println(name2);

        name3.replace(0,4,"Ah");
        System.out.println(name3);

    }
}
