#过滤数据
SELECT last_name,salary,hire_date
FROM employees
#where department_id;
#where last_name = 'king';
WHERE last_name = "king";#orcle中不能用,这么写也不规范
#where hire_date = '1987-06-17';

#在查询中使用字符串,日期型变量时,需要用一对''来表示
DESC employees;

#sql区分大小写,字符串内要区分,但是mysql不区分中''不区分大小写

#1.比较运算
SELECT last_name,salary,hire_date
FROM employees
WHERE salary >= 6000;

#2.between and (包含边界)
SELECT last_name,salary,hire_date
FROM employees
#where salary between 6000 and 8000;#注意前后不可颠倒
#where salary >= 6000 and salary <= 8000;#和上面的语句意义相同,注意salary不可以省略
WHERE last_name BETWEEN 'Ernst' AND 'Urman';#能排序就能比较大小

#in(set)
SELECT last_name,salary,department_id
FROM employees
#where department_id in (50,60,70);
WHERE department_id = 50 OR department_id = 60 OR department_id = 70;

#模糊查询
#查询姓名中包含字符a
# %表示0个,1个或多个字符
SELECT last_name
FROM employees
WHERE last_name LIKE '%a%';

#练习1.包含a且包含e
SELECT last_name
FROM employees
#WHERE last_name LIKE '%a%' and last_name LIKE '%e%';
WHERE last_name LIKE '%a%e' OR last_name LIKE '%e%a%';

#练习2.第二个字符是a
#_:表示一个字符
SELECT last_name
FROM employees
WHERE last_name LIKE '_a%';

#练习3.第二个字符是_,第三个是a
#可以用\来表示转义字符
SELECT last_name
FROM employees
#WHERE last_name LIKE '_\_a%';
WHERE last_name LIKE '_$_a%' ESCAPE '$';#用$代表转义

#is null:为空
#is not null:不为空
SELECT employee_id,last_name,commission_pct
FROM employees
WHERE commission_pct IS NULL; #为空
#where commission_pct is not null; #不为空


#逻辑运算符 and or xor(亦或:不一样的时候满足)
SELECT last_name,salary,hire_date
FROM employees
WHERE salary >= 6000
&& job_id LIKE '%man%';


