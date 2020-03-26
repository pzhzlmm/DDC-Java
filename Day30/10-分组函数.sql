#分组函数

#10.1 sum avg
#orcle中AVG(last_name)报错,严格不能用在字符串日期上
#只适用于数值型变量
SELECT SUM(salary),AVG(salary),AVG(last_name),AVG(hire_date)
FROM employees;

#10.2 max/min
#数值类型,字符类型,日期类型都适用
SELECT MAX(salary),MIN(salary),MAX(last_name),MIN(hire_date)
FROM employees;

#10.3 count
#计算指定字段的非空字段的个数
SELECT COUNT(employee_id),COUNT(employee_id),COUNT(commission_pct)
FROM employees;

#结论 avg = sum / count 此时count不包括为空的字段,因此avg计算不科学
SELECT AVG(commission_pct),SUM(commission_pct)/107,
SUM(commission_pct)/COUNT(commission_pct),
SUM(commission_pct)/COUNT(IFNULL(commission_pct,0))#计算平均奖金率公式,这里随便什么值都可以
FROM employees;

#计算总数
#负数,0,字符串,*好像都行....具体用什么快跟存储引擎有关系
SELECT COUNT(employee_id),COUNT(1),COUNT('很好')
FROM employees;


#10.4 group by 
#按部门查最大值
SELECT MAX(salary),department_id
FROM employees
GROUP BY `department_id`;

#查询不同一个部门,不同工种
SELECT MAX(salary),job_id,AVG(salary),department_id
FROM employees
GROUP BY job_id,`department_id`;
#上下两个都对
SELECT MAX(salary),job_id,AVG(salary),department_id
FROM employees
GROUP BY `department_id`,job_id;
#结论:非组函数一定要声明在group by之中,表示要按照该字段分组

#10.5 having
#练习:部门最高工资比10000高的部门
SELECT department_id,MAX(salary)
FROM employees #有where和from放一起
WHERE MAX(salary) > 10000
GROUP BY department_id;
#结论:如果过滤条件中出现了组函数,则需要用having替换where
SELECT department_id,MAX(salary)
FROM employees #有where和from放一起
HAVING MAX(salary) > 10000
GROUP BY department_id;
#orcle中通过,但是mysql这里要求把having声明在group by后面
SELECT department_id,MAX(salary)
FROM employees #有where和from放一起
GROUP BY department_id
HAVING MAX(salary) > 10000;

#10,20,30中,最高工资比10000高的部门
SELECT department_id,MAX(salary)
FROM employees #有where和from放一起
WHERE  department_id IN(10,20,30)
GROUP BY department_id
HAVING MAX(salary) > 10000;
#也可以用having
SELECT department_id,MAX(salary)
FROM employees 
GROUP BY department_id
HAVING MAX(salary) > 10000
AND department_id IN(10,20,30);
#以上两种方式都可以,但是后面这种方式不推荐
#因为相较于方式二,方式一执行效率更高
#结论:包含组函数的过程条件的必须在having中,
#     不包含组函数的过滤条件中建议声明在where中
#原因:因为就执行过程而言,from找查询的表,然后用where过滤,筛掉一些不要的,having是走了一遍之后拿了结果去用