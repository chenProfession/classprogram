package com.classbook.chapter.chatting.server;

import com.classbook.chapter.chatting.threadchat.SocketReader;
import com.classbook.chapter.chatting.threadchat.SocketWriter;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/12/11 3:39 下午
 */
public class ServerChat {
    public static void main(String[] args) throws IOException {
        int serverPort = 8899;
        //创建服务器并指定端口号
        ServerSocket server=new ServerSocket(serverPort);

        while(true){
            //开启监听
            Socket socket=server.accept();

            //创建线程
            Thread send=new Thread(new SocketWriter(socket,"网管"));
            Thread reception=new Thread(new SocketReader(socket));

            //开启线程
            send.start();
            reception.start();
        }
    }
}
