package cor._1homework;

import java.io.File;

/**
 * @author XinLan Wang
 * @create 2020-03-19 16:27
 * 遍历指明目录下的所有的文件，输出所有的文件名。
 */
public class $homework3 {

    public static void main(String[] args) {
        //传入要遍历的路径
//        folder("D:\\Software");
    }

    /**
     * description: folder
     * version: 1.0
     * date: 2020/3/20 9:08
     * author: XinLan Wang
     *
     * @param file
     * @return void
     */
    public static void folder(File file){
        if (file.isFile()){
            System.out.println();
        }else{
            File[] files =file.listFiles();
            for (File fil : files) {
                folder(fil);
            }
        }
    }
//
//    public static void folder(String path) {
//        File[] files = new File(path).listFiles();
//
//        for (File file : files) {
//            if (file.isDirectory()) {
//                System.out.println("文件夹:" + file.getAbsolutePath());
//                folder(file.getAbsolutePath());
//            } else {
//                System.out.println("文件:" + file.getAbsolutePath());
//            }
//        }
//    }
}
