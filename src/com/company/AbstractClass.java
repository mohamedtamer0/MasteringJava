package com.company;

public abstract class AbstractClass {
    public abstract void see();

    public class abc extends AbstractClass{

        @Override
        public void see() {
            System.out.println("Abstract");
        }
    }


    public static void main(String[] args) {

    }
}


