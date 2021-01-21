package com.allweing.day16_network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @auther: zzzgyu
 */

public class Test1 {
    static Socket socket;
    static OutputStream outputStream;
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,8888);
            outputStream = socket.getOutputStream();
            outputStream.write("hello================".getBytes());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
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
