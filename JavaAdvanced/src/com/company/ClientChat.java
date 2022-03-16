package com.company;

import java.io.*;
import java.net.Socket;

public class ClientChat {
    private static Socket socket;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        socket = new Socket("127.0.0.1", 8899);

        System.out.println("Connected");

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String r_msg, s_msg;
        while (true) {
            //Server
            System.out.println("To Server:");
            s_msg = bufferedReader.readLine();
            objectOutputStream.writeObject(s_msg);
            //Client
            System.out.println("Waiting for connection........");
            if ((r_msg = (String) objectInputStream.readObject()) != null) {
                System.out.print("\n Server says:" + r_msg);
            }
        }
    }
}
