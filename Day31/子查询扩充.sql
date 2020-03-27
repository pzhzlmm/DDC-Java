#11-子查询
#子查询:查询里又嵌套有查询

#谁的工资比abel高
#方式一:先找到abel的,再找到比abel高的
SELECT salary
FROM employees
WHERE last_name = 'Abel';

SELECT last_name,salary
FROM employees
WHERE salary > 11000;

#方式二:自连接
SELECT e2.last_name,e2.salary
FROM employees e1,employees e2
WHERE e1.`last_name` = 'Abel'
AND e1.`salary` < e2.`salary`;

#方式三:子查询
SELECT last_name,salary
FROM employees
WHERE salary > (
	SELECT salary
	FROM employees
	WHERE last_name = 'Abel'
	);
#1.基本描述
#声明在外面的是外查询,主查询
#声明在里面的是内查询,子查询(括号内,建议放右侧)
#返回一条,单行子查询,对应单行操作符
#返回多行,多行子查询,对应多行操作符

#2.单行子查询
#题目：返回job_id与141号员工相同，
#salary比143号员工多的员工姓名，job_id和工资
SELECT last_name, job_id, salary
FROM   employees
WHERE  job_id =  
                (SELECT job_id
                 FROM   employees
                 WHERE  employee_id = 141)
AND    salary >
                (SELECT salary
                 FROM   employees
                 WHERE  employee_id = 143);
                 
#题目：返回公司工资最少的员工的last_name,job_id和salary
#小技巧:查的xxx,先写出来
#写子查询的步骤:从外往里写/从里往外写(先把定语翻译成查询)
SELECT last_name,job_id,salary
FROM   employees
WHERE salary = (SELECT MIN(salary)
		FROM employees
		);


#题目：查询最低工资大于60号部门最低工资的部门id和其最低工资
SELECT   department_id, MIN(salary)
FROM     employees
GROUP BY department_id
HAVING   MIN(salary) >
                       (SELECT MIN(salary)
                        FROM   employees
                        WHERE  department_id = 50);

#空值
SELECT last_name, job_id
FROM   employees
WHERE  job_id =
                (SELECT job_id
                 FROM   employees
                 WHERE  last_name = 'Haas');#里面查询不到东西了

#单行子查询错误:
SELECT employee_id, last_name
FROM   employees
WHERE  salary =
                (SELECT   MIN(salary)
                 FROM     employees
                 GROUP BY department_id);#里面是多个值

#3.多行子查询
#可以使用的运算符有:in all any
#in 取内查询中每个值的情况,接着求并集
SELECT employee_id, last_name
FROM   employees
WHERE  salary IN #取其中一个值
                (SELECT   MIN(salary)
                 FROM     employees
                 GROUP BY department_id);

#any 任一, all 所有

#题目：返回其它job_id中比job_id为‘IT_PROG’部门
#      任一工资低的员工的员工号、姓名、job_id 以及salary
SELECT employee_id,last_name,job_id,salary
FROM employees
WHERE salary < ANY(
		SELECT salary
		FROM employees
		WHERE job_id = 'IT_PROG'
		)
AND job_id <> 'IT_PROG';

#题目：返回其它job_id中比job_id为‘IT_PROG’部门
#所有工资都低的员工的员工号、姓名、job_id以及salary
SELECT employee_id,last_name,job_id,salary
FROM employees
WHERE salary < ALL(
		SELECT salary
		FROM employees
		WHERE job_id = 'IT_PROG'
		)
AND job_id <> 'IT_PROG';

#子查询位置灵活:除了group by/limit里不能写子查询,其他的都可以写子查询

SELECT * FROM employees GROUP BY employee_id HAVING (COUNT(*) > 3);


		
#####################################################以下难度较大

#3.查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资
SELECT DISTINCT e1.employee_id,e1.last_name,e1.salary
FROM employees e1 LEFT JOIN employees e2
WHERE e1.`salary` > (
	SELECT AVG(salary)
	FROM employees e2
)
#内外不相关,内查询相当于一个常量


SELECT employee_id,last_name,salary
FROM employees e1
WHERE salary > (
		# 查询某员工所在部门的平均
		SELECT AVG(salary)
		FROM employees e2
		WHERE e2.department_id = e1.`department_id`#和外面送进来的数据一致的,这种和外面相关的称为相关子查询
		);
#方式二
#在from中声明子查询
SELECT employee_id,last_name,salary
FROM employees e1,
(SELECT department_id,AVG(salary) avg_sal
FROM employees e2 GROUP BY department_id
) dept_avg_sal
WHERE e1.`department_id` = dept_avg_sal.department_id
AND e1.`salary` > dept_avg_sal.avg_sal;


#employee_id,last_name,按照depart_name来排序

SELECT employee_id,last_name,salary
FROM employees e1
ORDER BY(
	SELECT department_name
	FROM departments d
	WHERE d.`department_id`= e1.`department_id`
)

#EXISTS
#查找存在条件的行
#选择公司中管理者的姓名及job_id
#方式一
SELECT employee_id,last_name,job_id,department_id
FROM employees
WHERE employee_id IN(
		SELECT DISTINCT manager_id
		FROM employees
		);
#方式二
SELECT DISTINCT e1.employee_id, e1.last_name, e1.job_id, e1.department_id
FROM   employees e1 JOIN employees e2
WHERE e1.employee_id = e2.manager_id;

#方式三
SELECT employee_id,last_name,job_id,department_id
FROM employees
WHERE employee_id IN (
		     SELECT DISTINCT manager_id
		     FROM employees
		     
		     );

#查询departments表中，不存在于employees表中的部门的department_id和department_name

SELECT department_id,department_name
FROM departments d
WHERE NOT EXISTS(
		SELECT 'a'
		FROM employees e
		WHERE d.`department_id` = e.`department_id` 
)

#9.查询平均工资最低的部门信息和该部门的平均工资（难）

