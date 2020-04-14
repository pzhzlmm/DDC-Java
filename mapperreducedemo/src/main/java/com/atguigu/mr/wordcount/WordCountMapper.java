package com.atguigu.mr.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * version: 1.0
 * 自定义Mapper,四个泛型,表示两组KV对,一组是输入的KV,一组是输出数据的KV
 * 输入:
 * KEYIN :记录读取的具体位置(文件读取数据的偏移量,下次从哪里读取),定义为longwritable范围更大
 * VALUEIN :test,表示从文件中读取的一行数据
 *
 * 输出:
 * KEYOUT:Test,表示一个单词
 * VALUEOUT:intwritable,表示单词出现了一次
 * @author XinLan Wang
 * @create 2020-04-14 15:30
 * @description: WordCountMapper 类的主要功能为:
 */
public class WordCountMapper extends Mapper<LongWritable, Text,Text, IntWritable> {

    IntWritable outv = new IntWritable(1);
    Text outK = new Text();

    /**
     * description: map
     * 重写Mapper类中的map方法
     * version: 1.0
     * date: 2020/4/14 15:37
     * author: XinLan Wang
     *
     * @param key : 表示输入的k
     * @param value:表示输入的V,就是文件中读取的一行内容
     * @param context:负责调度mapper运行的
     * @return void
     */
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
//        1.将输入的一行数据,转换成字符串类型,(因为javaAPI丰富,最后再进行转换)
        //atguigu atguigu
        String line = value.toString();
//        2.通过空格切分数据
        String[] splits = line.split("");
//        3.迭代,将每个单词处理成kv,写出去
        for (String word : splits) {
            outK.set(word);
            context.write(outK,outv);
        }

    }
}
