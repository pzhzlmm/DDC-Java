package com.atguigu.ex1;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println(new SDText().x + "," + new SDText().y 
				+ "," + new SDText().x);
	}
}

class SDText {
	static int x = 3;
	static SDText sd = new SDText();
	static int y;

	public SDText() {
		x++;
		y++;
	}
}