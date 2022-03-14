package com.company;

public class SwitchEnum {
    public static void main(String[] args) {
        Names name = Names.TAMER;
        switch (name) {
            case MOHAMED:
                System.out.println("Mohamed");
                break;
            case TAMER:
                System.out.println("Tamer");
                break;
            case MOHAND:
                System.out.println("Mohand");
                break;
            default:
                break;
        }
    }
}

enum Names {
    MOHAMED,TAMER,MOHAND;
}
