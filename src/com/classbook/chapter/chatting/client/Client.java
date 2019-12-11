package com.classbook.chapter.chatting.client;

import com.classbook.chapter.chatting.threadchat.SocketReader;
import com.classbook.chapter.chatting.threadchat.SocketWriter;

import java.io.IOException;
import java.net.Socket;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/12/11 3:44 下午
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //ip  和  端口号
        Socket socket=new Socket("localhost",6666);

        Thread  send       =new Thread(new SocketWriter(socket,"我"));
        Thread  reception  =new Thread(new SocketReader(socket));

        send.start();
        reception.start();
    }
}
