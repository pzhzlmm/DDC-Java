package cor._1hom._2Inet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 16:35
 * @description: URLTest 类的主要功能为:
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("1.jpg");
        //基于url有很多方法
        System.out.println(url.getProtocol());//协议
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());
    }
}
