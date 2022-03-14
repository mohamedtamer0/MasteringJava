package com.company;

import java.util.Date;

public class StringOut {
    public static void main(String[] args) {
        char c = 'z';
        boolean bool = true;
        byte b = 127;
        short s = 32000;
        int i = 2000000;
        long l = 16500000L;
        float f = 1234565.66866f;
        double d = 1212121212121125.34d;
        System.out.println(c);
        System.out.println(bool);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        Date nDate = new Date();
        System.out.println(nDate);
    }
}
