/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-26 14:16
 * @description: Person 类的主要功能为:
 */
public class Person {
    private Person() {
    }

    private static Person person;

    public static Person getInstance() {
        if (person == null){
            synchronized(Person.class){
                if (person == null){
                    return  new Person();
                }else{
                    return person;
                }
            }
        }
        return person;
    }
}
