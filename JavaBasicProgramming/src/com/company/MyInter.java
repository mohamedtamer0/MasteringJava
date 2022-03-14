package com.company;

interface MyInter {
    void see();

    class MyInterClass implements MyInter {

        @Override
        public void see() {
            System.out.println("Test");
        }
    }
}

class Main2 {
    public static void main(String[] args) {

    }
}
