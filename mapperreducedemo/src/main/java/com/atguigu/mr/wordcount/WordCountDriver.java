package com.atguigu.mr.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-04-14 15:30
 * @description: WordCountDriver 类的主要功能为:
 */
public class WordCountDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //1.创建一个job对象
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);
        //2.关联jar
        job.setJarByClass(WordCountDriver.class);
        //3.关联mapper和reducer类
        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);
        //4.设置mapper的输出key和value类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        //5.设置最终输出的key和value类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        //6.设置输入和输出路径
        FileInputFormat.setInputPaths(job,new Path("D:/temp/hadoop"));
        FileOutputFormat.setOutputPath(job,new Path("D:/temp/hadoop/test"));
        //7.提交job
        job.waitForCompletion(true);

    }
}
