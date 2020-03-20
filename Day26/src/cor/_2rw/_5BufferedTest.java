package cor._2rw;

import org.junit.Test;

import java.io.*;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 14:38
 * @description: _5Buffered 类的主要功能为:
 * 处理流之一:缓冲流的讲解
 */
public class _5BufferedTest {
    /**
     * description: testBufferdInputOutput非文本文件的复制
     * 使用buffer缓冲流能提高读写效率
     * version: 1.0 
     * date: 2020/3/20 14:40 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void testBufferdInputOutput(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.造文件
            File srcFile = new File("text.png");
            File destFile = new File("text2.png");
            //2.造流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            //把上面的流用各自的缓冲流包裹起来
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.读写
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            //先关外面,再关里面,先把装饰流给释放了
            //但在外面关闭的时候,里面也自动关掉了
            try {
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //因此可以省略
//        fileOutputStream.close();
//        fileInputStream.close();
        }

    }


    /**
     * description: test
     * 测试加缓冲流和不加缓冲流的效果差异
     * version: 1.0
     * date: 2020/3/20 14:55
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        String src = "D:\\download\\BaiduNetdiskDownload\\03_IDEA.zip";
        String dest = "D:\\download\\BaiduNetdiskDownload\\03_IDEA1.zip";

//        copyFireWithFiled(src,dest);//4126
        copyFireWithBufferd(src,dest);//1104
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
    
    public void copyFireWithFiled(String src,String dest){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //创建文件
            File srcfile = new File(src);
            File destfile = new File(dest);

            //创建流
            fileInputStream = new FileInputStream(srcfile);
            fileOutputStream = new FileOutputStream(destfile);

            //读取并写入
            byte[] buffer = new byte[1024];
            int len;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyFireWithBufferd(String src,String dest){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.造文件
            File srcFile = new File(src);
            File destFile = new File(dest);
            //2.造流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            //把上面的流用各自的缓冲流包裹起来
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.读写
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            //先关外面,再关里面,先把装饰流给释放了
            //但在外面关闭的时候,里面也自动关掉了
            try {
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //因此可以省略
//        fileOutputStream.close();
//        fileInputStream.close();
        }
    }


    /**
     * description: ReaderWritertest
     * 步骤二
     * readline方法测试
     * version: 1.0
     * date:  15:38
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void ReaderWritertest(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //1.造文件 造流
            bufferedReader = new BufferedReader(new FileReader(new File("D:\\download\\BaiduNetdiskDownload\\03_IDEA.zip")));
            bufferedWriter = new BufferedWriter(new FileWriter(new File("D:\\download\\BaiduNetdiskDownload\\03_IDEA.zip")));


            //2.读写文件
            //写法一
        /*char[] cbuf = new char[1024];
        int len;
        while (((len = bufferedReader.read())) != -1){
            bufferedWriter.write(cbuf,0,len);
        }*/
        //写法二
        String data;
        while ((data = bufferedReader.readLine()) != null){
//            bufferedWriter.write(data + "\n"); 方法一
            bufferedWriter.write(data);
            bufferedWriter.newLine();//换行
//            bufferedWriter.flush();//刷新,内存中缓存数据的清空,原来需要手动加,现在不需要手动写了
        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        //3.关闭资源
        try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
