package com.itheima.demo02.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description：文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据
 * @Author 金宇佳
 * @Date 2020/12/10 10:07
 * @Version 1.0
 */

/*
    文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据

    明确:
        数据源:c:\\1.jpg
        目的地:服务器
    实现步骤:
        1.创建一个本地字节输入流 FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端囗号
        3.使用 Socket 中的方法 getOutputStream,获取网络字节输出流 OutputStream对象
        4.使用本地字节输入流 FileInputStream对象中的方法read,读取本地文件
        5.使用网络字节输出流 OutputStream对象中的方法 write,把读取到的文件上传到服务器
        6.使用 Socket中的方法 getInputStream,获取网路字节输入流 InputStream对象
        7.使用网络字节输入流 InputStream对象中的方法read读取服务回写的数据
        8.释放资源(FileInputStream,Socket)
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个本地字节输入流 FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\a.jpg");
        //2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端囗号
        Socket socket = new Socket("127.0.0.1", 8888);
        //3.使用 Socket 中的方法 getOutputStream,获取网络字节输出流 OutputStream对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流 FileInputStream对象中的方法read,读取本地文件
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            //5.使用网络字节输出流 OutputStream对象中的方法 write,把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }

        //6.使用 Socket中的方法 getInputStream,获取网路字节输入流 InputStream对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流 InputStream对象中的方法read读取服务回写的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //8.释放资源(FileInputStream,Socket)
        fis.close();
        socket.close();
    }
}