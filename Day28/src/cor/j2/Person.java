package cor.j2;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 9:37
 * @description: Person 类的主要功能为:
 */
@$$MyAnnotation
class Person extends Creature<Integer>  implements Comparable<Integer>,MyInterface{
    private String name;
    public int age;
    private static String info = "我是一个人";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String showNation1(String nation,int year) {
        System.out.println(year);return nation;
    }
    public void showNation(String nation) {
        System.out.println(nation);
    }

    public static void showInfo(){
        System.out.println("lalalalla");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @$$MyAnnotation(vavlue = "hello")
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



    public Person() {
    }

    @Override
    public void test() {

    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
