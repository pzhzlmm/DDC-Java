package cor._3tr;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import sun.plugin2.ipc.InProcEvent;

import java.io.*;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 15:53
 * @description: InputStringReaderTest 类的主要功能为:
 * 转换流,字节流与字符流的相互转换
 * InputStreamReader:字节转字符
 * OutputStreamWriter:字符转字节
 * 解码必须是编码时候使用的字符集,否则,解码会出现乱码
 * 作用:解码
 */
public class $_1InputStringReaderTest {
    @Test
    public void testInputStramReader() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("info.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //可以指定字符集,如果没指定默认和Idea的字符集相同
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");

        char[] cbuf = new char[1024];
        int len;
        while ((len = inputStreamReader.read(cbuf)) != -1){
            //???
//            String string = new String(cbuf, 0, len);
//            System.out.println(string);
        }

        inputStreamReader.close();
    }

    /**
     * description: test
     * 输入的又输出了
     * version: 1.0
     * date: 2020/3/20 16:08
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test() throws IOException {
        //1.
        InputStreamReader isr = new InputStreamReader(new FileInputStream(""));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(""));
        //2.
        char[] cbuf = new char[1024];
        int len;
        while ((len = isr.read(cbuf)) != 01){
            osw.write(cbuf,0,len);
        }

        osw.close();
        isr.close();

    }
}
