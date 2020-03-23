package com.atguigu.java1;

import java.util.Arrays;

import org.junit.Test;
/*
 * 1. 实现对象的排序，可以考虑两种方法：
 * 	> 实现Comparable接口
 *  > 实现Comparator接口
 *  
 *  
 * 2. 像String、包装类、Date等已经实现了Comparable接口，则可以实现同一个类的不同对象的大小的比较。
 * 
 * 3. 默认情况下，String、包装类、Date等类型进行排序的话，默认从小到大的方式排序
 * 
 * 4. 自定义的类，要想实现排序，需要考虑实现Comparable接口，重写compareTo()。
 *    在此方法中，指明如何比较大小。
 *    标准：
 * 		如果当前对象大，返回正数
 * 		如果当前对象小，返回负数
 * 		如果两个对象相等，返回0
 */
public class ComparableTest {
	
	@Test
	public void test1(){
		String[] arr = new String[]{"BB","DD","GG","JJ","MM","AA"};
		
		System.out.println(Arrays.toString(arr));
		
		//能给String排序的前提，是String对象可以比较大小
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void test2(){
		Goods g1 = new Goods("Lenovo", 7800);
		Goods g2 = new Goods("Huawei", 8800);
		Goods g3 = new Goods("Dell", 5800);
		Goods g4 = new Goods("Xiaomi", 4800);
		Goods g5 = new Goods("HP", 9800);
		
		Goods[] arr = new Goods[]{g1,g2,g3,g4,g5};
		
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		//排序：
		Arrays.sort(arr);
		System.out.println();
		
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
