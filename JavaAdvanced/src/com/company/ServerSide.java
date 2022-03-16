package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4444);
        Socket socket = serverSocket.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = inputStream.readUTF();
            System.out.println("client=" + str);
            str2 = bufferedReader.readLine();
            outputStream.writeUTF(str2);
            outputStream.flush();
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
