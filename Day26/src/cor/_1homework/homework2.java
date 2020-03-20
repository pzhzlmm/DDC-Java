package cor._1homework;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author XinLan Wang
 * @create 2020-03-19 16:27
 * 创建一个与"hello.txt"文件在相同目录下的另一个名为"abc.txt"
 * //File file = new File("d:/abc/hello.txt");
 */
public class homework2 {

    /**
     * description: test
     * version: 1.0
     * date: 2020/3/20 8:58
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test() throws IOException {
        File src = new File("d:/abc/hello.txt");
//        System.out.println(src.getParent());//绝对路径可以,相对路径会返回null
//        src.getAbsoluteFile().getParent();//这样即便是相对路径,也可以返回
        File dest = new File(src.getAbsoluteFile().getParent(),"abc.txt");
        dest.createNewFile();
        System.out.println("创建成功");//这里有个简单输入方法

    }
    
    public static void main(String[] args) {
        File file = new File("d:/abc/hello.txt");
        File file1 = new File(file.getParent(),"abc.txt");
    }
}
