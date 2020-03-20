package cor._2rw;

import cor._1homework.test;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 14:12
 * @description: _4FireReaderWriterTest 类的主要功能为:
 * 通常使用字节流处理非文本文件,用字符流来处理非文本文件
 * 如果用字节流去处理字符,字符可能会被肢解,所以可以用来保存,如果中途打开,可能会出现乱码
 */
public class _4FireInputOutputTest {
    @Test
    public void test(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //创建文件
            File srcfile = new File("test.png");
            File destfile = new File("test1.png");

            //创建流
            fileInputStream = new FileInputStream(srcfile);
            fileOutputStream = new FileOutputStream(destfile);

            //读取并写入
            byte[] buffer = new byte[1024];
            int len;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    

}
