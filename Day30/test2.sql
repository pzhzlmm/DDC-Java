#1.where子句可否使用组函数进行过滤? 
# 可以,但是并不推荐这么使用,因为这样会降低效率
#2.查询公司员工工资的最大值，最小值，平均值，总和
SELECT MAX(salary),MIN(salary),SUM(salary)/COUNT(IFNULL(salary,0)),SUM(salary)
FROM employees;
SELECT MAX(salary),MIN(salary),AVG(salary),SUM(salary)
FROM employees;
#3.查询各job_id的员工工资的最大值，最小值，平均值，总和
SELECT job_id,MAX(salary),MIN(salary),SUM(salary)/COUNT(IFNULL(salary,0)),SUM(salary)
FROM employees
GROUP BY job_id;
#4.选择具有各个job_id的员工人数
SELECT job_id,COUNT(job_id)
FROM employees
GROUP BY job_id;
# 5.查询员工最高工资和最低工资的差距（DIFFERENCE）
SELECT (MAX(salary) - MIN(salary)) DIFFERENCE,MAX(salary),MIN(salary)
FROM employees;
# 6.查询各个管理者手下员工的最低工资，其中最低工资不能低于6000，没有管理者的员工不计算在内
SELECT manager_id,MIN(salary)
FROM employees
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING MIN(salary) > 6000;
# 7.查询所有部门的名字，location_id，员工数量和工资平均值($$)
SELECT department_name, location_id, COUNT(employee_id), AVG(salary)
FROM employees e RIGHT JOIN departments d
ON e.`department_id` = d.`department_id`
GROUP BY department_name, location_id;
#所有:外连接

#小结:
/*
SELECT 可能包含组函数
FROM ...,...,..(JOIN...ON...
JOIN...ON...
JOIN...ON...)
WHERE 过滤条件 OR/AND(建议用不包含组函数的过滤条件)
GROUP BY ...,...,...
HAVING ....(包含组函数的过滤条件)
ORDER BY ... asc/desc 查询
LIMIT... 分页
*/