/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  ManKind.java   
 * @Package com.atguigu.ex.ex2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����3:02:08   
 * @version V1.0 
 */
package com.atguigu.ex1;

/**
 * @ClassName: ManKind
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��2��28�� ����3:02:08 
 * (1)����һ��ManKind�࣬���� ��Ա����int sex��int salary�� 
 * ����voidmanOrWoman()������sex��ֵ��ʾ��man��(sex==1)���ߡ�woman��(sex==0)�� 
 * ����voidemployeed()������salary��ֵ��ʾ��no job��(salary==0)���ߡ� job��(salary!=0)��
* 
 */
public class ManKind {
	int sex;
	int salary;

	/**   
	 * @Title: manOrWoman   
	 * @Description: TODO   
	 * 	����sex��ֵ��ʾ��man��(sex==1)���ߡ�woman��(sex==0)�� 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	void manOrWoman(){
		if(sex == 1){
			System.out.println("man");
		}else if(sex == 0){
			System.out.println("woman");
		}else{
			System.out.println("???");
		}
	};
	
	/**   
	 * @Title: employeed   
	 * @Description: TODO 
	 * ����voidemployeed()��
	 * ����salary��ֵ��ʾ��no job��(salary==0)���ߡ� job��(salary!=0)��  
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	void employeed(){
		if(salary == 0){
			System.out.println("no job");
		}else{
			System.out.println("job");
		}
	}
}