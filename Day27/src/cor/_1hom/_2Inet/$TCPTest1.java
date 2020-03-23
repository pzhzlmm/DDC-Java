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
 * @create 2020-03-21 15:23
 * @description: TCPTest1 类的主要功能为:
 * 客户端发送文件给服务端,服务端把文件保存到本地
 */
public class $TCPTest1 {
    
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

        outputStream.close();
        fileInputStream.close();
        socket.close();
    }

/**
 * description: server debug
 * version: 1.0 
 * date: 2020/3/21 15:39
 * author: XinLan Wang
 * 
 * @param 
 * @return void
 */ 
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

        inputStream.close();
        fileOutputStream.close();
        socket.close();
    }
}
