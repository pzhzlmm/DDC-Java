package cor._1hom._2Inet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 16:48
 * @description: URLTest1 类的主要功能为:
 */
public class URLTest1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://tu.66vod.net/2019/3111.jpg");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("pl.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }
        System.out.println("下载成功");
    }
}
