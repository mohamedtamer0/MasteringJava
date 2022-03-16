package com.company;


import com.sun.net.httpserver.HttpContext;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://github.com/mohamedtamer0");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        for (int i = 0; i < 10; i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + "=" + httpURLConnection.getHeaderField(i));
        }
        httpURLConnection.disconnect();
    }
}
