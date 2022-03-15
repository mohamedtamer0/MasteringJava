package com.company;

public class Exceptions {

    public static void age(int n) {
        if (n < 20) {
            throw new ArithmeticException("you are below 20");
        } else {
            System.out.println("yes you can vote");
        }
    }


    public static void main(String[] args) {
        try {
            int i = 100 / 0;
            System.out.println(i);

            String s = null;
            System.out.println(s.length());

            int[] str = new int[2];
            str[12] = 60;
        } catch (ArithmeticException e) {
            System.out.println("you can not divide by Zero");
        } catch (NullPointerException e) {
            System.out.println("no length fo Null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array IndexOut of Bounds");
        } catch (Exception e) {
            System.out.println("Error ");
        }

        age(23);
        System.out.println("Mohamed Tamer");

    }
}
