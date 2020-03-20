package cor.re.homework;

import sun.awt.SunHints;

import java.util.*;

/**
 * @author XinLan Wang
 * @create 2020-03-18 16:37
 * 提供一个方法，用于遍历获取HashMap<String,String>中的所有value，并存放在List中返回。考虑上集合中泛型的使用
 */
public class homework1 {

    /**
     * description: getValues关于昨天的作业一的评讲三种可以比较一下使用
     * version: 1.0
     * date: 2020/3/20 8:54
     * author: XinLan Wang
     *
     * @param map
     * @return java.util.List<java.lang.String>
     */
    //老师
    public List<String> getValues(HashMap<String,String> map){
        //方式一
//        Collection<String> values = map.values();
//        ArrayList<String> list = new ArrayList<>(values.size());//为了避免底层无意义的扩容
//        for (String value : values){
//            list.add(value);
//        }
//        return list;

        //方式二
//        Collection<String> values = map.values();
//        ArrayList<String> list = new ArrayList<>(values.size());
//        list.addAll(values);
//        return list;

        //方式三
        Collection<String> values = map.values();
        return new ArrayList<>(values);

//        执行效率
    }
    //自己
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, String> entry: stringHashMap.entrySet())
        {
            String value = entry.getValue();
            list.add(value);
        }
    }
}
