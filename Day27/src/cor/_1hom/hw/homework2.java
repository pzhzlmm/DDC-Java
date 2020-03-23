package cor._1hom.hw;

import org.junit.Test;

import java.io.*;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 20:51
 * @description: homework2 类的主要功能为:
 * 将gbk格式的文件转换为utf-8格式存储
 */
public class homework2 {
    @Test
    public void test() {
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        try {
            //1.声明对象
            String src = new String("info.txt");
            String desc = new String("info1.txt");

            //显示写上gbk
            reader = new InputStreamReader(new FileInputStream(new File(src)), "gbk");
            writer = new OutputStreamWriter(new FileOutputStream(new File(desc)), "utf-8");
            //2.转换
            char[] cbuf = new char[1024];
            int len;
            while ((len = reader.read(cbuf)) != -1) {
                writer.write(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
