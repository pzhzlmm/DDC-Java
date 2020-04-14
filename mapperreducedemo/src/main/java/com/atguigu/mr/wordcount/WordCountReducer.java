package com.atguigu.mr.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


/**
 * version: 1.0
 * 需要继承Reducer类,继承4个泛型,4个泛型表示两组KV对
 * 一组是输入的KV,一组是输出的KV
 * 输入的KV对:
 * KEYIN:对于map输出的K,表示一个单词
 * VALUEIN:对应map输出的V,表示单词出现的次数
 *
 * 输出的KV对:
 * KEYOUT: text,表示一个单词
 * VALUEOUTintweitable,表示这个单词出现的总次数
 *
 * 定义写出的key
 * Test outk =  new
 * @author XinLan Wang
 * @create 2020-04-14 15:30
 * @description: WordCountReducer 类的主要功能为:
 */
public class WordCountReducer extends Reducer<Text, IntWritable,Text, IntWritable> {
    IntWritable outv = new IntWritable(1);

    /**
     * description: reduce
     * 重写Reducer中的reduce方法
     * version: 1.0
     * date: 2020/4/14 15:51
     * author: XinLan Wang
     *
     * @param key:表示输入的key,就是一个单词
     * @param values:表示封装了当前key对应的所有的value的一个迭代器对象,累加的时候被迭代
     * @param context:负责调度reducer运行
     * @return void
     */
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //1.迭代values,将当前key对应的所有value进行累加
        int sum = 0;
        for(IntWritable value:values){
            sum += value.get();//获取1
        }
        //2.写出
        outv.set(sum);
        context.write(key,outv);
    }
}
