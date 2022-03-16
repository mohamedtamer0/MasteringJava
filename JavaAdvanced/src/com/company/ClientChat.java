package com.company;

import java.io.*;
import java.net.Socket;

public class ClientChat {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 8899);

        System.out.println("Connected");

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
