package homr.hom2;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 20:49
 * @description: jdbcTest 类的主要功能为:
 * 在工程或module的src下有名为”jdbc.properties”的配置文件，文件内容为：name=Tom。如何在程序中通过代码获取Tom这个变量值。代码实现
 */
public class jdbcTest {
    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/jdbc.properties");
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        System.out.println("name = " + name);
    }
}
