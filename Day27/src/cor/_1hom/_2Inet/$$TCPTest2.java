package cor._1hom._2Inet;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 15:37
 * @description: TCPTest2 类的主要功能为:
 * 在上一文件的基础之上添加反馈,显示发送成功
 * 可以抄下聊天室
 */
public class $$TCPTest2 {

    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127,0,0,1"),9191);
        FileInputStream fileInputStream = new FileInputStream("baby.jpg");
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while((len = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        //接收来自服务器端的数据
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[10];
        int len1;
        while ((len1 = inputStream.read(bytes1)) != -1){
            byteArrayOutputStream.write(bytes1,0,len1);
        }//read方法也是阻塞式的,最后要shutdown,真正做的时候,可以设置成两个不同的线程
        System.out.println(byteArrayOutputStream.toString());

        outputStream.close();
        byteArrayOutputStream.close();
        fileInputStream.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("src/baby123.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }

        //服务器端给客户端数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("get".getBytes());

        inputStream.close();
        fileOutputStream.close();
        socket.close();
    }
}
