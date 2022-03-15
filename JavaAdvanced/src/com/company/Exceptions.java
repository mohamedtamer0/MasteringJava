package com.company;

public class Exceptions {
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
        }
        catch (NullPointerException e) {
            System.out.println("no length fo Null");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array IndexOut of Bounds");
        }
        catch (Exception e) {
            System.out.println("Error ");
        }

    }
}
