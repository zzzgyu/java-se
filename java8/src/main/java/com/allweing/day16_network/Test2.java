package com.allweing.day16_network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther: zzzgyu
 */

public class Test2 {
    static ServerSocket serverSocket;
    static Socket socket;
    static InputStream inputStream;
    static  ByteArrayOutputStream byteArrayOutputStream;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(8888);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int i;
            while ((i = inputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes,0,i);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
