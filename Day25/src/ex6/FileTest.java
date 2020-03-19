package ex6;

import org.junit.Test;

import java.io.File;

/**
 * @author XinLan Wang
 * @create 2020-03-18 15:45
 * 关于File类
 * 1.io包下
 * 2.即可以表示文件,也可以保存文件目录(文件夹)
 */
public class FileTest {

    /**
     * 如何创建File类的对象
     */
    @Test
    public void test1(){
        //方式一:传入路径名,分为绝对路径和相对路径
        // 绝对路径:
        File file1 = new File("D:\\io\\hello.txt");// \\有个\代表转义,所以写两个
        //相对路径:
        //  module:相较于当前module
        //  main:相较于当前工程
        File file2 = new File("abc.txt");

        //表示文件目录:
        File file3 = new File("D:\\io");
        File file4 = new File("D:/io");//斜杠的另外表示方法

    }

    @Test
    public void test2(){
        File file1 = new File("D:\\io","abc.txt");
        File file2 = new File("D:/io");
        File file3 = new File(file2,"abc.txt");
    }

    public static void main(String[] args) {
        File file2 = new File("abc.txt");
    }
}
