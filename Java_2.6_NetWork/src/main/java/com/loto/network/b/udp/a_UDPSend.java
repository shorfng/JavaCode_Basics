package com.loto.network.b.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 15:26
 * <p>PageName：a_UDPSend.java
 * </p>
 * <p>Function：UDP发送端
 */

public class a_UDPSend {
    public static void main(String[] args) throws IOException {
        // 1、创建DatagramSocket对象
        DatagramSocket sendSocket = new DatagramSocket();

        // 2、创建DatagramPacket对象，并封装数据
        // public DatagramPacket(byte[] buf, int length, InetAddress address,  int port)
        // 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号
        byte[] buffer = "hello,UDP".getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("192.168.31.197"), 12306);

        // 3、发送数据
        // public void send(DatagramPacket p) 从此套接字发送数据报包
        sendSocket.send(dp);
        System.out.println("发送数据完毕！");

        // 4、释放流资源
        sendSocket.close();
    }
}
