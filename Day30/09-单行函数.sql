#09-单行函数

#1.字符串相关函数
SELECT CONCAT('abc','--','123') "details"
FROM DUAL;

#练习
SELECT CONCAT(emp.last_name,' work for ',mgr.`last_name`)
FROM employees emp JOIN employees mgr
ON emp.`manager_id` = mgr.`employee_id`;

SELECT CONCAT_WS('abc','--','123','123')
FROM DUAL;

SELECT CHAR_LENGTH('dsdsd'),LENGTH('dsdsd'),CHAR_LENGTH('dsdsd'),LENGTH('dsdsd')
FROM DUAL;

#sql中出现的索引都是从1开始的
SELECT INSERT('hello',2,2,'55555555555')
FROM DUAL;

#字符串,数值型,日期型变量间存在隐式转换
SELECT last_name,LPAD(salary,10,'*')
FROM employees;
#结果一共是十位,不足的用*去替代,相当于右对齐

#trim 去除左右空格
SELECT CONCAT('-----',TRIM('   和看到啥UI哦 的都是 多少度   '),'85860')
FROM DUAL;
#还可以去除指定的字符串

SELECT REPLACE('helloworld','ll','www')
FROM DUAL;

SELECT STRCMP('avc','vds')
FROM DUAL;


#2.数字型相关函数,CEIL取上,floor,取下
SELECT CEIL(123.45),FLOOR(123.45)
FROM DUAL;
#四舍五入
SELECT ROUND(123.45),ROUND(123.45,0),ROUND(123.45,1),ROUND(123.45,-3)
FROM DUAL;
#TRUNCATE 截断操作
#TRUNCATE(123.55,0)#后面的0不能去掉
SELECT TRUNCATE(123.55,0),TRUNCATE(123.55,1),TRUNCATE(123.55,-1)
FROM DUAL;

#3.日期型
SELECT CURDATE(),CURRENT_DATE(),CURTIME(),CURRENT_TIME(),NOW(),SYSDATE()
FROM DUAL;

SELECT YEAR(CURDATE()),MONTH(CURDATE()),DAY(NOW())
FROM DUAL;

SELECT HOUR(CURTIME()),MINUTE(NOW()),SECOND(CURTIME())
FROM DUAL;

SELECT DAYNAME(CURDATE()),DAYNAME('2020-03-19')#日期到字符串的隐式转换
FROM DUAL;

#格式化:把日期转化为字符串
#解析:把字符串转化为日期
#空,参考老师的

#了解
#参考老师的


#4,流程函数
SELECT employee_id,last_name,salary,IF(salary > 10000,'高富帅','矮丑穷')
FROM employees;

SELECT employee_id,last_name,commission_pct,IF(commission_pct IS NOT NULL,commission_pct,0)
FROM employees;

SELECT employee_id,last_name,commission_pct,salary,IFNULL(commission_pct,0),
salary *12 * (1 + IFNULL(commission_pct,0))
FROM employees;

#case when
SELECT employee_id,last_name,salary,CASE WHEN salary > 15000 THEN '高富帅'
					 WHEN salary > 10000 THEN '绩优股'
					 WHEN salary > 7000 THEN '潜力股'
					 ELSE '小屌丝' END "details"
FROM employees;

#没有else则为null了
SELECT employee_id,last_name,salary,CASE WHEN salary > 15000 THEN '高富帅'
					 WHEN salary > 10000 THEN '绩优股'
					 WHEN salary > 7000 THEN '潜力股'
					 END "details"
FROM employees;

#expr 相当于swith case
#老师程序例子


#练习 回看复习下
SELECT employee_id,last_name,salary,
CASE department_id WHEN 10 THEN salary * 1.1
		   WHEN 20 THEN salary * 1.2
	           WHEN 30 THEN salary * 1.3
	           END "new_salary"
	           FROM employees
	           WHERE department_id IN (10,20,30);
	           
#5.其他函数
SELECT DATABASE(),VERSION(),USER()
FROM DUAL;

SELECT MD5(MD5('123456'))
FROM DUAL;#md5加密