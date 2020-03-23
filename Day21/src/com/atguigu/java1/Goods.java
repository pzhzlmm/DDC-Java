package com.atguigu.java1;

public class Goods implements Comparable{//商品
	
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Goods() {
		super();
	}
	public Goods(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	//按照产品的价格进行排序
	/*
	 * 标准：
	 * 如果当前对象大，返回正数
	 * 如果当前对象小，返回负数
	 * 如果两个对象相等，返回0
	 */
	//练习：① 按照产品的名称排序   ②先按照价格排序，再按照产品名称排序  ③ ②先按照价格排序，再按照产品名称从高到低排序
	@Override
	public int compareTo(Object o) {
		System.out.println("compare....");
		if(o instanceof Goods){
			Goods g = (Goods)o;
			
			//方式一：
//			if(this.price > g.price){
//				return 1;
//			}else if(this.price < g.price){
//				return -1;
//			}else{
//				return 0;
//			}
			
			//方式二：
			return -Double.compare(this.price, g.price);
		}
		
		throw new RuntimeException("输入的类型不匹配");
	}
	
	

}
