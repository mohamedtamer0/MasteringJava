package com.company;

public class RunTimeErrors {
    public static void main(String[] args) {

        try {
            int[] num = {1,2,3};
            System.out.println(num[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("there is an Error");
        }
    }
}
