package com.atguigu.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.hdfs.util.ByteArrayManager;
import org.apache.hadoop.io.IOUtils;
import org.apache.kerby.config.Conf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.nio.ch.IOUtil;

import java.io.*;
import java.net.URI;
import java.util.Arrays;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-04-13 9:21
 * @description: TestHDFS 类的主要功能为:
 */
public class TestHDFS {
    public TestHDFS() throws IOException {
    }

    /**
     * description: 在HDFS创建目录
     * 客户端去操作集群,第一步是拿到客户端对象,第二部做操作,第三步关闭
     * version: 1.0
     * date: 2020/4/13 9:22
     * author: XinLan Wang
     *
     * @param null
     * @return
     */
    @Test
    public void testMKdir() throws IOException, InterruptedException {
        //1.获取客户端对象,文件系统对象
//        URI uri = new URI("hdfs://hadoop:9820");
        URI uri = URI.create("hdfs://hadoop102:9820");
        Configuration conf = new Configuration();//配置对象
        String user = "atguigu";//谁去操作
        //uri:定位资源,指定HDFS集群的位置,即找到namenode就找到集群了
        FileSystem fileSystem = FileSystem.get(uri, conf, user);

        //2.操作
        fileSystem.mkdirs(new Path("/testjava3"));

        //3.关闭
        fileSystem.close();
    }

    /**
     * description: testUpload
     * 文件的上传
     * version: 1.0
     * date: 2020/4/13 9:36
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testUpload() throws IOException, InterruptedException {
        //1.获取客户端对象
        URI uri = URI.create("hdfs://hadoop102:9820");
        Configuration conf = new Configuration();//配置对象
        conf.set("dfs.replication","1");
        String user = "atguigu";//谁去操作
        //uri:定位资源,指定HDFS集群的位置,即找到namenode就找到集群了
        FileSystem fileSystem = FileSystem.get(uri, conf, user);
        //2.
        fileSystem.copyFromLocalFile(false,true,
                new Path("D:/temp/hadoop/hello.txt"),
                new Path("/testjava2/test3/tesr4"));
    }


    private FileSystem fs;
    //@Before:在所有的测试方法之前会执行这个方法
    @Before
    public void before() throws IOException, InterruptedException {
        URI uri = URI.create("hdfs://hadoop102:9820");
        Configuration conf = new Configuration();
        String user = "atguigu";
        fs = FileSystem.get(uri,conf,user);
    }

    //@After:在所有的测试方法之后会执行这个方法
    @After
    public void after() throws IOException {
        fs.close();
    }

    /**
     * description: testRename
     * 文件的更名和移动
     * version: 1.0
     * date: 2020/4/13 10:38
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testRename() throws IOException {
        fs.rename(new Path("/testjava2/hello.txt"),new Path("/testjava2/testjava2.txt"));
        //改名并移动
        fs.rename(new Path("/testjava2/testjava2.txt"),new Path("/xinlan.txt"));
    }

    /**
     * description: testListFiles
     * 文件详情查看
     * version: 1.0
     * date: 2020/4/13 10:43
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testListFiles() throws IOException {
        RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(new Path("/"),true);
        while (listFiles.hasNext()){
            LocatedFileStatus next = listFiles.next();
            //打印每个文件的详情
            System.out.println(next.getPermission() + "\t" +
                    next.getOwner() + "\t" +
                    next.getGroup() + "\t" +
                    next.getLen() + "\t" +
                    next.getReplication() + "\t" +
                    next.getBlockSize() + "\t" +
                    next.getPath().getName());

            BlockLocation[] blockLocations = next.getBlockLocations();
            System.out.println(Arrays.toString(blockLocations));
            System.out.println("--------------------------");
        }

    }
    public void readFile(Path path) throws IOException {
        FileStatus[] fileStatuses = fs.listStatus(path);
        for (FileStatus status : fileStatuses){
            if (status.isDirectory()){
                System.out.println(status.getPath().getName() + "是一个目录");
                readFile(status.getPath());
            }else{
                System.out.println(status.getPath().getName() + "是一个文件");
            }
        }
    }
    @Test
    public void testReadFile() throws IOException {
        readFile(new Path("/"));//我写的
//        testAllDirAndFile("/",fs);
    }


    public void testAllDirAndFile(String path,FileSystem fs) throws IOException {
        FileStatus[] listStatus = fs.listStatus(new Path(path));
        //迭代判断
        for (FileStatus status : listStatus){
            //如果是文件
            if (status.isFile()){
                System.out.println("File==>" + path + "/" + status.getPath().getName());
            }else {
                System.out.println("DIR==>" + status.getPath().toString());
                testAllDirAndFile(status.getPath().toString(),fs);
            }
        }
    }


    /**
     * description: testIOUpload
     *
     * version: 1.0
     * date: 2020/4/13 11:30
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testIOUpload() throws IOException {
        //待上传的文件
        String src = "D:/temp/hadoop/hello.txt";
        //目标文件
        String dest = "/hahaha.txt";
        //输入流
        FileInputStream in = new FileInputStream(new File(src));
        //输出流
        FSDataOutputStream out = fs.create(new Path(dest));
        //流的拷贝
        /*int i;
        byte[] buffer = new byte[1024];
        while ((i = in.read(buffer)) != -1){
            out.write(buffer,0,i);
        }

        */
        //$$$1137讲这里的时候断网了
        IOUtils.copyBytes(in,out, ByteArrayManager.Conf);
        //关闭
        /*if (in != null){
            in.close();
        }*/
        IOUtils.closeStream(in);
        IOUtils.closeStream(out);
    }
    
    @Test
    public void testIODownload() throws IOException {
        //待上传的文件
        String src = "/hahaha.txt";
        //目标文件
        String dest = "D:/temp/hadoop/hello3.txt";
        //输入流
        FSDataInputStream in = fs.open(new Path(src));
        //输出流
        FileOutputStream out = new FileOutputStream(new File(dest));
        //流的拷贝

        //$$$1137讲这里的时候断网了
        IOUtils.copyBytes(in,out, conf);
        //关闭

        IOUtils.closeStream(in);
        IOUtils.closeStream(out);
    }

    //第一块内容
    @Test
    public void testIODownload1() throws IOException {
        //待上传的文件
        String src = "/hahaha.txt";
        //目标文件
        String dest = "D:/temp/hadoop/hello3part1.txt";
        //输入流
        FSDataInputStream in = fs.open(new Path(src));
        //输出流
        FileOutputStream out = new FileOutputStream(new File(dest));
        //流的拷贝

        //$$$1137讲这里的时候断网了
        IOUtils.copyBytes(in,out, conf);
        //关闭

        IOUtils.closeStream(in);
        IOUtils.closeStream(out);
    }

    @Test
    public void testIODownload2() throws IOException {
        //待上传的文件
        String src = "/hahaha.txt";
        //目标文件
        String dest = "D:/temp/hadoop/hello3part2.txt";
        //输入流
        FSDataInputStream in = fs.open(new Path(src));
        //输出流
        FileOutputStream out = new FileOutputStream(new File(dest));
        //流的拷贝

        //$$$1137讲这里的时候断网了
        IOUtils.copyBytes(in,out, conf);
        //关闭

        IOUtils.closeStream(in);
        IOUtils.closeStream(out);
    }
    
    /**
     * description: isDirOrFile
     * 判断是文件还是文件夹
     * version: 1.0
     * date: 2020/4/13 10:53
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void isDirOrFile() throws IOException {
        FileStatus[] fileStatuses = fs.listStatus(new Path("/"));
        for (FileStatus status : fileStatuses){
            if (status.isDirectory()){
                System.out.println(status.getPath().getName() + "是一个目录");
            }else{
                System.out.println(status.getPath().getName() + "是一个文件");
            }
        }
    }

    /**
     * description: testDelete
     * 删除文件
     * version: 1.0
     * date: 2020/4/13 10:30
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testDelete() throws IOException {
        //删除文件
//        fs.delete(new Path("/testjava/hello.txt"),true);
        //给的是文件设的是false会抛出个异常
        fs.delete(new Path("/testjava"),true);
        //给的是文件设的是false会抛出个异常
    }
    
    /**
     * description: testDowload
     * 文件的下载
     * version: 1.0
     * date: 2020/4/13 10:17
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testDowload() throws IOException {
        //参数提示:ctrl + p
        fs.copyToLocalFile(false,
                new Path("/testjava"),
                new Path("D:/temp/hadoop/ss.txt"),//可以明确指定一个名字
                true);//是否开启文件校验
    }
}
