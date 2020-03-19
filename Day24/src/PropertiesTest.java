import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	@Test
	public void test1() throws IOException{
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream("info.properties");
		pros.load(fis);
		String name = pros.getProperty("name");
		System.out.println(name);
		System.out.println();

	}
}
