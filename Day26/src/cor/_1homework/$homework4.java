package cor._1homework;

import org.junit.Test;

import java.io.File;

/**
 * @author XinLan Wang
 * @create 2020-03-19 16:27
 * 获取指定文件目录中所有文件的大小
 */



public class $homework4 {

    /**
     * description: test 遍历文件,思考文件的remove操作,造一个深度为5的文件目录
     * version: 1.0 
     * date: 2020/3/20 9:16 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test(){

    }

    public static void main(String[] args) {
        double FilesSize = FirlSize(new File("D:\\Software"));
        System.out.println(FilesSize);

    }

    public static double FirlSize(File file) {
        if (file.isDirectory()) {
            File[] Subfiles = file.listFiles();
            double size = 0;
            for (File f : Subfiles)
                size += FirlSize(f);
            return size;
        } else {
            double size = (double) file.length() / 1024 / 1024;
            return size;
        }
    }

}
