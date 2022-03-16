package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",5555);
            DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
            outputStream.writeUTF("Hi am your Client");
            outputStream.flush();
            outputStream.close();
            s.close();
        } catch (IOException e) {
        }
    }
}
