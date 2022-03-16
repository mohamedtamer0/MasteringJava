package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    private static ServerSocket serverSocket;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serverSocket = new ServerSocket(8899);
        System.out.println("Server is listening.......");
        Socket socket = serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        InputStream inputStream = (InputStream) socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String r_msg, s_msg;
        while (true) {
            //Client
            System.out.println("Waiting for Clients to be connect.......");
            if ((r_msg = (String) ois.readObject()) != null) {
                System.out.print("\n User says:" + r_msg);
            }

            //server
            System.out.println("to User:");
            s_msg = bufferedReader.readLine();
            objectOutputStream.writeObject(s_msg);
        }
    }
}
