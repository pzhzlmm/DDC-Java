import org.junit.Test;

import java.util.*;

//一个标签,表明里面放了什么东西
public class GenericTest {

    //集合中使用泛型之前的例子
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        //添加学生成绩
        list.add(67);
        list.add(87);
        list.add(79);
        list.add(90);

//        list.add("TOM");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            int score = (int) iterator.next();
            System.out.println(score);
        }
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //泛型只能放入基本数据类型
        //添加学生成绩
        list.add(67);
        list.add(87);
        list.add(79);
        list.add(90);
//        list.add("tom");非integer编译不通过不能添加
        //2.读取数据
        //alt + 回车 快捷生成
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int score = iterator.next();
            System.out.println(score);
        }
    }
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
//        Map<String,Integer> map = new HashMap<>();JDK7中新特性:类型推断
        map.put("小紫",88);
        map.put("小红",98);
        map.put("小明",100);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //jdk10这里可以写成var,进行自动类型推断
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "----->" + entry.getValue());
//            string
        }
    }
    //向Treeset中添加数据,使用自然排序和定制排序,要去使用比较器和泛型
}
