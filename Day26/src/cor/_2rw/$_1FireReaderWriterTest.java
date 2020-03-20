package cor._2rw;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 10:23
 * @description: FireReaderWriterTest 类的主要功能为:
 * test3
 */
public class $_1FireReaderWriterTest {
    /**
     * description: test
     * 读入数据的基础写法
     * version: 1.0 
     * date: 2020/3/20 10:25 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test() throws IOException {
        //1.创建文件对象
        File file = new File("hello.txt");

        //2.创建流对象
        FileReader fileReader = new FileReader(file);

        //read():阻塞式方法,读取一个字符,读到末尾会返回-1,正常数据是0-65535的正数
        //3.读取数据
//        System.out.println(fileReader.read());//104,h的码
//        System.out.println((char)(fileReader.read()));//会吧下一个读进来 a
        //全部读取
        int data = fileReader.read();
        while (data != -1){
            System.out.print((char)data);
            data = fileReader.read();
        }

        //4.关闭流
        //JVM不会自动把流资源给关闭,我们必须手动去关闭
        fileReader.close();//其实这里也会有个异常

        //所有流的过程都是这四步
    }


    /**
     * description: test2 对上面程序进行优化(主要是处理异常)
     * 在io流中,凡是需要手动关闭流资源的程序中,都需要try-catch-finally来处理异常
     * 快捷键:ctrl + alt + t
     * 比对一下是不是这么写的???
     * version: 1.0
     * date: 2020/3/20 10:36
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2(){
        //1.创建文件对象
        File file = new File("hello.txt");
        FileReader fileReader = null;

        try {
            //2.创建流对象
            fileReader = new FileReader(file);

            //3.读取数据
            int data = fileReader.read();
            while (data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            try {
                fileReader.close();//其实这里也会有个异常
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * description: test3 上面程序的改进
     * 缓存.每次读取一个字符数组***
     * read返回读取的个数
     * version: 1.0
     * date: 2020/3/20 10:45
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test3(){
        //1.创建文件对象
        File file = new File("hello.txt");
        FileReader fileReader = null;

        try {
            //2.创建流对象
            fileReader = new FileReader(file);

            //3.读取数据
            int data = fileReader.read();
            while (data != -1){
                System.out.print((char)data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            try {
                fileReader.close();//其实这里也会有个异常
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
