package cor._1homework;

import java.io.File;

/**
 * @author XinLan Wang
 * @create 2020-03-19 16:27
 * 创建一个与"hello.txt"文件在相同目录下的另一个名为"abc.txt"
 * //File file = new File("d:/abc/hello.txt");
 */
public class homework2 {
    public static void main(String[] args) {
        File file = new File("d:/abc/hello.txt");
        File file1 = new File(file.getParent(),"abc.txt");
    }
}
