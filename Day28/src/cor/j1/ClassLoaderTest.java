package cor.j1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 11:51
 * @description: ClassLoader 类的主要功能为:
 */
public class ClassLoaderTest {
    public static void main(String[] args) {

    }

    /**
     * description: test
     * 如何加载配置文件
     * version: 1.0
     * date: 2020/3/23 11:57
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test() throws IOException {
        Properties pros = new Properties();
        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        pros.load(fileInputStream);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name);
        System.out.println(password);
    }

    /**
     * description: test2
     * 目录放到src目录
     * version: 1.0
     * date: 2020/3/23 12:02
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/jdbc1.properties");
        pros.load(fileInputStream);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name);
        System.out.println(password);

    }

    /**
     * description: test3
     * 使用类的加载器也可以获取properties配置文件内容
     * 但默认路径是module的src目录下
     * version: 1.0
     * date: 2020/3/23 12:04
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc1.properties");
        pros.load(inputStream);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name);
        System.out.println(password);
    }
}
