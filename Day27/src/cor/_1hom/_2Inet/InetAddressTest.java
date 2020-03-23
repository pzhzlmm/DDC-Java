package cor._1hom._2Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 14:11
 * @description: InetAddress 类的主要功能为:
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //获取InetAddress对象(外地)
            InetAddress inetAddress1 = InetAddress.getByName("192.168.23.43");
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            //获取InetAddress对象(本地)
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);

            //InetAddress的实例获取ip的方法
            System.out.println(inetAddress1.getHostName());
            System.out.println(inetAddress1.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
