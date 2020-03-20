package hw;

import org.junit.Test;

import java.io.*;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 20:51
 * @description: homework1 类的主要功能为:
 * 使用缓冲流实现a.jpg文件复制为b.jpg文件的操作
 */
public class homework1 {
    @Test
    public void test(){
        
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1 创建对象
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.jpg")));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("b.jpg")));

            //2 转换数据
            byte[] cbuf = new byte[1024];
            int len;

            while ((len = bufferedInputStream.read(cbuf)) != -1){
                bufferedOutputStream.write(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3 关闭流
            try {
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
