package cor._2rw;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 11:23
 * @description: _3zhongheex 类的主要功能为:
 */
public class $$_3zhongheex {
    /**
     * description: test
     * 从hello写到info
     * version: 1.0
     * date: 2020/3/20 11:23
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.指名读取的对象和写入的
            File scrfile = new File("hello.txt");
            File destFile = new File("hello1.txt");

//            File scrfile = new File("text.png");
//            File destFile = new File("text1.png");
            //可以创建图片,但打不开,字符流不可以处理非文本文件的数据

            //2.创建对应的io流
            fileReader = new FileReader(scrfile);
            fileWriter = new FileWriter(destFile);
            //3.读取并写入
            char[] cbuf = new char[5];//根据文件具体大小去判定读取长度.通常是1024,缓冲流是8*1024
            int len;//记录每次读入到char[]中的个数
            while((len = fileReader.read(cbuf)) != -1){
    //            fileWriter.write(cbuf);错误的,每次都读完的
                fileWriter.write(cbuf,0,len);//每次读到多少长度读多少
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            //先关谁后关谁都可以,习惯是从下往上
            //可嵌套,可并列
            try {
                if (fileWriter !=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter !=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
