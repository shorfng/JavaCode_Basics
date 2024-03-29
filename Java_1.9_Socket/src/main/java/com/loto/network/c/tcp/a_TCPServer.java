package com.loto.network.c.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 16:16
 * <p>PageName：a_TCPServer.java
 * </p>
 * <p>Function：TCP 服务器端
 */

public class a_TCPServer {
    public static void main(String[] args) throws IOException {
        // 1、创建服务器ServerSocket对象（指定服务器端口号）
        ServerSocket ss = new ServerSocket(8888);

        // 2、开启服务器了，等待客户端的连接，当客户端连接后，可以获取到连接服务器的客户端Socket对象
        Socket s = ss.accept();

        // 3、给客户端反馈信息
        OutputStream out = s.getOutputStream();     // 获取客户端的输出流
        out.write("你已经连接上了服务器".getBytes());   // 在服务端端，通过客户端的输出流写数据给客户端

        // 4、关闭流资源
        out.close();
        s.close();
        //ss.close();  服务器流（通常都是不关闭的）
    }
}
