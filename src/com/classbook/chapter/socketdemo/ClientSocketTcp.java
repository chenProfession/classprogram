package com.classbook.chapter.socketdemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/12/2 1:36 下午
 */
public class ClientSocketTcp {
    public static void main(String[] args){
        String message = "Hii this is James, nice to meet you!";
        try {
            String serverAddress = "127.0.0.1";
            int serverPort = 8899;
            Socket socket = new Socket(serverAddress, serverPort);
            BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write(message);
            bufferedWriter.flush();
            socket.shutdownOutput();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (ConnectException e) {
            System.out.println("can not get connection, please try again!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
