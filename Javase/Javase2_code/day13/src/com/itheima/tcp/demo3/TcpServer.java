package com.itheima.tcp.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Stream;

//服务端程序
public class TcpServer {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpServer类");


    public static void main(String[] args) throws IOException {
        //创建服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(9090);
        LOGGER.trace("服务端程序已启动...");

        //监听客户连接，生成Socket对象
        Socket server = ss.accept();
        LOGGER.trace(server.getInetAddress().getHostAddress() + "客户端已连接成功~");

        //基于Socket对象，获取网络输入流（接收数据）
        InputStream netInput = server.getInputStream();
        //创建本地输出流（把读取的文件数据，写入到本地文件中）
        FileOutputStream fos = new FileOutputStream("day13\\files\\112.png");

        //利用网络输入流，获取客户端发送过来的数据（文件中的数据）
        byte[] buf = new byte[1024];
        int len = -1;
        while ((len = netInput.read(buf)) != -1) {
            //把接收到的数据，写入到本地文件中
            fos.write(buf, 0, len);
        }

        LOGGER.trace("上传文件接收完毕!");

        //基于Socket对象，获取网络输出流（发送数据）
        OutputStream out = server.getOutputStream();
        //缓冲流(参数为字符流),故再使用转换流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        bw.write("文件上传成功!");
        bw.newLine();//写入换行号


        //释放资源
        out.close();
        bw.close();
        netInput.close();
        server.close();

    }
}
