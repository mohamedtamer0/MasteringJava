package com.company;

public class Instance_int {
    public static void main(String[] args) {
        Test ins = new Test();
        ins.i = 5;
        System.out.println(ins.i);

        Test.a = 20;
        System.out.println(Test.a);
    }
}

class Test{
    int i;
    static int a;
}
