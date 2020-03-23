package com.atguigu.exer;

import org.junit.Test;

//关于笔试中常考的算法问题，主要就集中在数组和字符串的考查！

public class StringExer {

	// 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
	// 方式一：
	public String reverse1(String str, int start, int end) {// start:2,end:5
		if (str != null) {
			// 1.
			char[] charArray = str.toCharArray();
			// 2.
			for (int i = start, j = end; i < j; i++, j--) {
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
			}
			// 3.
			return new String(charArray);

		}
		return null;

	}

	// 方式二：
	public String reverse2(String str, int start, int end) {
		// 1.
		String newStr = str.substring(0, start);// ab
		// 2.
		for (int i = end; i >= start; i--) {
			newStr += str.charAt(i);
		} // abfedc
			// 3.
		newStr += str.substring(end + 1);
		return newStr;
	}

	// 方式三：推荐 （相较于方式二做的改进）
	public String reverse3(String str, int start, int end) {

		// 1.
		StringBuilder s = new StringBuilder(str.length());
		// 2.
		s.append(str.substring(0, start));// ab
		// 3.
		for (int i = end; i >= start; i--) {
			s.append(str.charAt(i));
		}

		// 4.
		s.append(str.substring(end + 1));

		// 5.
		return s.toString();

	}

	@Test
	public void testReverse() {
		String str = "abcdefg";
		String str1 = reverse3(str, 2, 5);
		System.out.println(str1);// abfedcg

	}

	// 获取一个字符串在另一个字符串中出现的次数。
	// 比如：获取“ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
	public int getCount(String mainStr, String subStr) {
		if (mainStr.length() >= subStr.length()) {
			int count = 0;//记录次数
			int index = 0;
			// while((index = mainStr.indexOf(subStr)) != -1){
			// 		count++;
			// 		mainStr = mainStr.substring(index + subStr.length());
			// }
			// 改进：
			while ((index = mainStr.indexOf(subStr, index)) != -1) {
				index += subStr.length();
				count++;
			}

			return count;
		} else {
			return 0;
		}

	}

	@Test
	public void testGetCount() {
		String str1 = "cdabkkcadkabkebfkabkskab";
		String str2 = "ab";
		int count = getCount(str1, str2);
		System.out.println(count);
	}
	
	//获取两个字符串中最大相同子串。比如：
//	   str1 = "abcwerthelloyuiodef"; str2 = "cvhellobnm"
//	      提示：将短的那个串进行长度依次递减的子串与较长的串比较。
	public String getMaxSameString(String str1,String str2){
		if(str1 != null && str2 != null){
			
			String maxStr = (str1.length() >= str2.length())? str1:str2;
			String minStr = (str1.length() < str2.length())? str1:str2;
			int len = minStr.length();//决定了比较的轮数
			for(int i = 0;i < len;i++){ //i:0
				
				for(int x = 0,y = len - i;y <= len;x++,y++){
					if(maxStr.contains(minStr.substring(x, y))){
						return minStr.substring(x, y);
					}
					
				}
				
			}
			
		}
		
		return null;
	}
	
	@Test
	public void testGetMaxSameSubString() {
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnmiodef";
		String str = getMaxSameString(str1, str2);
		System.out.println(str);
	}
}
