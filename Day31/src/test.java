import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.junit.Test;

import java.io.Serializable;
import java.util.Scanner;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-26 14:01
 * @description: test 类的主要功能为:
 */
public class test implements Serializable {
//    1、请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
    @Test
    public void test(){
        int[] arr = {5, 7, 3, 9, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }


    @Test
    public void test2(){
       /* 2、通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，
        例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
        请用非递归的方式完成方法long f( int n)的方法体。*/
        System.out.println(allsum(4));
    }

    public long allsum(int n){
        int sum = 0;
        while (n > 0){
            sum += n;
            n--;
        }
        return sum;
    }

//    1.第一个人10，第2个比第1个人大2岁，以此类推，请用递归方式计算出第8个人多大？

    public static int age = 10;
    @Test
    public void test3(){
        countage(1);
        System.out.println(age);
    }

    private int countage(int count){
        if (count >= 8){
            return age;
        }else {
            count ++ ;
            age = age + 2;
//            System.out.println(age + ":" +  count);
            return countage(count);
        }
}


//    2.有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的字数。
//    举例说明： String content = “中中国55kkfff”; 统计出：中：2, 国：1,  5：2,  k：2,  f：32
   /* @Test
    public void test5(){
        //66000
        int haxi[] = new int[66000];
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = (int)chars[i];
            haxi[num]++;
        }
        for (int i = 0; i < haxi.length; i++) {
            if (haxi[i] != 0){
                System.out.println((char)i + ":" + haxi[i]);
            }
        }
    }*/

    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i); }
    public static void change(int i){
        i++;
    }

}
