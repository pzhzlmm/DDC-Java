package cor._1hom._2Inet;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 14:44
 * @description: TcpTest 类的主要功能为:
 */
public class TCPTest {

    @Test
    public void clinet() throws IOException {//客户端
        //socket = ip + 端口
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");//指名对方(服务器端)的ip
        int port = 9090;//指名对方的端口号
        //1.创建socket实例
        Socket socket = new Socket(inetAddress, port);

        //2.获取一个输出流
        //握手代码已被封装
        OutputStream outputStream = socket.getOutputStream();

        //3.写入数据
        outputStream.write("你好我是客户端".getBytes());

        //4.关闭资源
        outputStream.close();
        socket.close();//socket也需要关闭
    }

    @Test
    public void server() throws IOException {//服务器端

        //1. 创建serversocket(与客户端指定的相同)
        int port = 9090;
        ServerSocket serverSocket = new ServerSocket(port);

        //2. 接收来自客户端的socket
        Socket socket = serverSocket.accept();
        //此方法是阻塞式方法,可以通过此方法得到不同客户端的信息
        System.out.println(socket.getInetAddress().getHostAddress());;
        //3. 获取输入流
        InputStream inputStream = socket.getInputStream();
        //4. 读取数据
        byte[] bytes = new byte[10];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len;
        while ((len = inputStream.read(bytes)) != -1){
//            java.lang.String str = new java.lang.String(bytes, 0, len);
//            System.out.println(str);
            //车小可能乱码,可以用stringbuider去接收,读完之后一起输出
            byteArrayOutputStream.write(bytes, 0, len);
        }
        System.out.println(byteArrayOutputStream.toString());



        //5. 关闭资源
        //服务器不用了也可以关,但一般都不会关
        inputStream.close();
        socket.close();
        serverSocket.close();
    }

}
