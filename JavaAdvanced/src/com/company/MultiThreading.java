package com.company;

public class MultiThreading extends Thread {
    @Override
    public void run() {
        System.out.println("Mohamed Tamer");
        for (int i = 5; i < 15; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        MultiThreading obj = new MultiThreading();
        obj.run();
        Main2 obj1 = new Main2();
        Thread obj2 = new Thread(obj1);
        obj2.start();

        obj.start();
    }
}


class Main2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Mohamed Tamer 2");
    }
}
