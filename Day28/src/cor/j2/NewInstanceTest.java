package cor.j2;

import org.junit.Test;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 14:14
 * @description: NewInstanceTest 类的主要功能为:
 */
public class NewInstanceTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        System.out.println(person);


    }
}
