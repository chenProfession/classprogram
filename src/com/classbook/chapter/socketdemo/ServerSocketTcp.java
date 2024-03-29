package com.classbook.chapter.socketdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/12/2 1:45 下午
 */
public class ServerSocketTcp {
    public static void main(String[] args){
        int serverPort = 8899;
        String message;
        try {
           ServerSocket serverSocket = new ServerSocket(serverPort);
           Socket socket = serverSocket.accept();
           BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
            //通过while循环不断读取信息，

            while ((message = bufferedReader.readLine())!=null){
                //输出打印
                System.out.println(message);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
