package cor._1homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XinLan Wang
 * @create 2020-03-18 16:37
 * 提供一个方法，用于遍历获取HashMap<String,String>中的所有value，并存放在List中返回。考虑上集合中泛型的使用
 */
public class homework1 {
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
