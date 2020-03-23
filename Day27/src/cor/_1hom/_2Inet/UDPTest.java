package cor._1hom._2Inet;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 16:19
 * @description: UDPTest 类的主要功能为:
 */
public class UDPTest {

    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] bytes = "hello".getBytes();
        InetAddress inet = InetAddress.getByName("127.0.0.1");

        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, inet,9090);

        socket.send(packet);
        socket.close();
    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        socket.receive(packet);

        String str = new String(packet.getData(),0,packet.getLength());
        System.out.println(str);
        socket.close();
    }

}
