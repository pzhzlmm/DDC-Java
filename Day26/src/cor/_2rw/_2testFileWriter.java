package cor._2rw;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 11:09
 * @description: _2testFileWriter 类的主要功能为:
 * 输出
 */
public class _2testFileWriter {
    @Test
    public void test() {
        FileWriter fileWriter = null;
        try {
            //1.创建file对象
            File file = new File("info.txt");//文件可以不存在

            //2.创建输出流
            fileWriter = new FileWriter(file);
            new FileWriter(file,false);
            //存在这种写法是对已有文件的覆盖
            //new FileWriter(file,true);是在现在文件的末尾追加内容
            //3.输出数据
//        fileWriter.write('a'); 效率有点低
            fileWriter.write("momo");
            fileWriter.write("ruo".toCharArray());//char型数组的形式输出
            fileWriter.write("allal".toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.手动关闭资源
                try {
                    if (fileWriter!=null) {
                        fileWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }



    }
}
