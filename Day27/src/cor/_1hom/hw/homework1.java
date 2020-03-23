package cor._1hom.hw;

import org.junit.Test;

import java.io.*;


public class homework1 {
    /**
     * description: test
     * 可把过程抽象为单独的方法,然后把源路径和目标路径作为参数传进去
     * version: 1.0
     * date: 2020/3/21 9:13
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test(){
        
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1 创建对象
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.jpg")));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("b.jpg")));

            //2 转换数据
            byte[] bytes = new byte[1024];
            int len;

            while ((len = bufferedInputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes);
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
