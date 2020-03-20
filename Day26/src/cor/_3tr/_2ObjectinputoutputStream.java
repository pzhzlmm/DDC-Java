package cor._3tr;

import org.junit.Test;

import java.io.*;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 16:37
 * @description: _2ObjectinputoutputStream 类的主要功能为:
 * 对象流,可以吧对象写入数据源,也可以把数据源写入对象
 * ObjectOutputStream:把内存中的数据写入具体文件中(持久化),也称作序列化过程
 * 反序列化:把磁盘中保存的对象还原为内存中的对象
 *
 * 住:
 * 基本数据类型都可序列化
 * 序列化不可修饰static,transient修饰的变量(一个不归管,另外一个是修饰不想被序列化的数据)
 */
public class _2ObjectinputoutputStream {

    @Test
    public void testOutputSteam() throws IOException {
//        1.创建文件和流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
//        2.操作基本数据类型
//        objectOutputStream.writeByte();
//        objectOutputStream.writeBoolean();
        //2.操作对象
        objectOutputStream.writeObject("tom");
        objectOutputStream.flush();//刷新
        objectOutputStream.writeObject("jerry");
        objectOutputStream.flush();//刷新
        objectOutputStream.writeObject(new Person("xiaohong",12));
        objectOutputStream.flush();//刷新



//        3.关闭
        objectOutputStream.close();
    }
    
    @Test
    public void testObjectInputStream() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));
        String s1 = (String) (objectInputStream.readObject());
        System.out.println(s1);
        String s2 = (String) (objectInputStream.readObject());
        System.out.println(s2);
        Person p = (Person) (objectInputStream.readObject());
        System.out.println(p);

    }
}
