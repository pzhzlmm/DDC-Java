package ex6;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author XinLan Wang
 * @create 2020-03-18 16:01
 * 本章内容:File的常用方法
 * 注意:File类不可读取写入文件数据,通常作为IO流的端点,作为参数传入IO的构造器中
 */
public class FileMethodTest {



    @Test
    public void test1(){
        File file1 = new File("D:\\io\\hello.txt");
        System.out.println(file1.getAbsoluteFile());//绝对路径 D:\io\hello.txt
        System.out.println(file1.getAbsolutePath());//
        System.out.println(file1.getPath());//D:\io\hello.txt
        //一个是路径,一个是对象
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());//文件大小,大小和使用的字符集相关
        System.out.println(file1.lastModified());//最后修改时间
        System.out.println(new Date(file1.lastModified()));


    }

    @Test
    public void test2(){
        File file1 = new File("abc.txt");
        System.out.println(file1.getAbsoluteFile());//D:\Code\JavaCode\Day25\abc.txt
        System.out.println(file1.getAbsolutePath());//D:\Code\JavaCode\Day25\abc.txt
        System.out.println(file1.getPath());//abc.txt
        //一个是路径,一个是对象
        System.out.println(file1.getName());//abc.txt
        System.out.println(file1.getParent());//null,想获取上层
        System.out.println(file1.length());//0
        System.out.println(file1.lastModified());//1584518102556
        System.out.println(new Date(file1.lastModified()));//Wed Mar 18 15:55:02 CST 2020
    }

    @Test
    public void test3(){
        File file1 = new File("abd.txt");//文件根本不存在的情况
        System.out.println(file1.getAbsoluteFile());//D:\Code\JavaCode\Day25\abd.txt
        System.out.println(file1.getAbsolutePath());//D:\Code\JavaCode\Day25\abd.txt
        System.out.println(file1.getPath());//abd.txt
        System.out.println(file1.getName());//abd.txt
        System.out.println(file1.getParent());//null
        //上面是内存中的对象,都能拿到,但因为文件不存在,后面的具体情况就拿不着了
        System.out.println(file1.length());//0
        System.out.println(file1.lastModified());//0
        System.out.println(new Date(file1.lastModified()));//Thu Jan 01 08:00:00 CST 1970
    }

    @Test
    public void test4(){
        File file1 = new File("D:\\Code\\Go");
        String[] list = file1.list();//返回的是字符串
        File[] list2 = file1.listFiles();//返回的是文件
        for(String s :list){
            System.out.println(s);
        }

        File file2 = new File("abc.txt");
        File file3 = new File("d:/io/abc123.txt");
        boolean isReNamed = file2.renameTo(file3);
        //要想成功,2得有,3得没有(但是3所在的目录得在)
        System.out.println(isReNamed);
    }

    @Test
    public void test5() {
        File file1 = new File("abc.txt");
        file1 = new File("D:/io");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());//默认存在
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }

    @Test
    public void test6() throws IOException {
        File file = new File("d:/io/hello234.txt");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            //文件目录如果不存在创建失败
            System.out.println("创建成功");
        }else{
            file.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test7(){
        File file = new File("d:/io/io2");
        file.mkdir();
        file.delete();//删除文件
        //直接上层目录得存在才能创建成功,如果上层不存在则直接创建失败

        //如果不存在,mkdir创建失败,而mkdirs创建成功
        File file1 = new File("d:/io/io3/io4");
        file1.mkdirs();//帮你一并创建了
    }
}
