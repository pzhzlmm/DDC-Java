package cor._1hom._1stream;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-21 9:32
 * @description: OtherStreamTest 类的主要功能为:
 */
public class OtherStreamTest {
    //我们把System.in称之为标准的输入流  默认从键盘输入
    //System.out称之为标准的输出流 默认从显示屏输出
    //也可以更改显示位置重定向(对应语句???)
    //注:用完需要关闭
    @Test
    public void test(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();//next会把空格换行当成结束,nextline会把空格换行都当成结束
        System.out.println(str);
        scanner.close();
    }

    /**
     * description: test2 写数据
     * version: 1.0
     * date: 2020/3/21 10:27
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2()  {
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            //里面可以直接放个file
            randomAccessFile1 = new RandomAccessFile("1.txt","r");
            randomAccessFile2 = new RandomAccessFile("2.txt","rw");

            randomAccessFile1.write("xyz".getBytes());
        /*byte[] bytes = new byte[1024];
        int len;
        while ((len = randomAccessFile1.read(bytes))!= -1){
            randomAccessFile2.write(bytes,0,len);
        }*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                randomAccessFile2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
