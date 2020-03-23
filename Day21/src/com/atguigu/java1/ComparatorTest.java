package com.atguigu.java1;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
 * 问题的引入：
 * ① 针对于StringBuffer 或 StringBuilder的多个对象构成的数组，如何实现排序呢？
 * ② 针对于String、Date、包装类，如何实现从大到小的顺序排序呢？
 * 
 * 1. 除了使用自然排序之外，还可以使用定制排序：实现Comparator接口
 * 
 * 2. 步骤：
 *   ① 提供实现Comparator接口的类
 *   ② 重写compare(Object o1,Object o2),指明对象如何比较大小
 *   ③ 实例化Comparator接口的类，并在需要的位置使用即可。
 * 
 * 3. 体会Comparable和Comparator的区别？
 * 		Comparable:理解为一劳永逸的方式。
 * 		Comparator:理解为一种临时的方式。
 *   
 */
public class ComparatorTest {
	@Test
	public void test1(){
		Goods g1 = new Goods("Lenovo", 7800);
		Goods g2 = new Goods("Huawei", 8800);
		Goods g3 = new Goods("Dell", 5800);
		Goods g4 = new Goods("Xiaomi", 4800);
		Goods g5 = new Goods("HP", 9800);
		Goods g6 = new Goods("Hasee", 9800);
		Goods g7 = new Goods("Apple", 9800);
		
		Goods[] arr = new Goods[]{g1,g2,g3,g4,g5,g6,g7};
		
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//创建Comparator接口的匿名实现类的对象
		Comparator comparator = new Comparator(){
			
			//在此方法中指明如何比较两个对象的大小
			//先安排价格排序，再按照产品名称从高到低排序
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Goods && o2 instanceof Goods){
					Goods g1 = (Goods)o1;
					Goods g2 = (Goods)o2;
					
					int result = Double.compare(g1.getPrice(), g2.getPrice());
					if(result != 0){
						return result;
					}
					
					return -g1.getName().compareTo(g2.getName());
					
				}
				throw new RuntimeException("输入的类型不匹配");
			}
			
		};
		
		//排序：
		Arrays.sort(arr,comparator);
		System.out.println();
		
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//练习：创建String类型的数组，按照字符串从大到小的顺序排序。
	@Test
	public void test2(){
		String[] arr = new String[]{"BB","DD","GG","JJ","MM","AA"};
		
		System.out.println(Arrays.toString(arr));
		
		//能给String排序的前提，是String对象可以比较大小
		Arrays.sort(arr,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String){
					String s1 = (String)o1;
					String s2 = (String)o2;
					return -s1.compareTo(s2);
				}
				throw new RuntimeException("输入的类型不匹配");
			}
			
		});
		
		System.out.println(Arrays.toString(arr));
	}
}
