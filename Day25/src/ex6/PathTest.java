package ex6;

import org.junit.Test;

import java.io.File;

/**
 * @author XinLan Wang
 * @create 2020-03-18 16:52
 */
public class PathTest {
    @Test
    public void test1(){
        File file = new File("hello.txt");//识别为:当前modulue
        System.out.println("file is "+ file.exists());
        File file1 = new File("abc.txt");
        System.out.println("file1 is "+ file1.exists());
    }

    public static void main(String[] args) {
        File file1 = new File("hello.txt");//识别为:当前工程
        System.out.println("file1 is "+ file1.exists());
    }
}
