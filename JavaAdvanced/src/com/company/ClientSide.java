package com.company;

import java.io.*;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 4444);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";

        while (!str.equals("stop")) {
            str = bufferedReader.readLine();
            outputStream.writeUTF(str);
            outputStream.flush();
            str2 = inputStream.readUTF();
            System.out.println("Server=" + str2);
        }
        outputStream.close();
        socket.close();
    }
}
