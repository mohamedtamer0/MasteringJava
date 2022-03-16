package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(5555);
            Socket ss = s.accept();
            DataInputStream in = new DataInputStream(ss.getInputStream());
            String str = (String) in.readUTF();
            System.out.println("msg = " + str);
            s.close();

        } catch (IOException e) {

        }
    }
}
