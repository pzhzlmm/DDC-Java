package cor.j1;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 9:37
 * @description: Person 类的主要功能为:
 */
public class Person {
    String name;
    public int age;


    public void showNation(String nation) {
        System.out.println(nation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String show() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("person run");
    }
}
