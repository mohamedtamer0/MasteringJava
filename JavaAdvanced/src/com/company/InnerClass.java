package com.company;

public class InnerClass {
    private String s = "Mohamed";

    class B {
        public void display() {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        InnerClass.B b = obj.new B();
        b.display();


    }
}
