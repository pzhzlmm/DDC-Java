#06-多表查询

#出现笛卡尔积的错误
SELECT employee_id,last_name,department_name
FROM employees,departments;

#没员工id的没找出来
#注意department_id在两个表都有,要显示表现出来
#列的别名只能在order by中使用(因为此时还没有加载进来)
SELECT employee_id,last_name,department_name,employees.`department_id`
FROM employees,departments
WHERE employees.`department_id` = departments.`department_id`;

#三个表的连接练习
SELECT employee_id,last_name,department_name,city
FROM employees e,departments d,locations l 
WHERE e.`department_id` = d.`department_id`
AND d.`location_id` = l.`location_id`;
#n个表做查询,则至少要有n - 1个连接条件

#分类
#等值连接 非等值连接
#自连接 非自连接
#内连接 外连接

#非等值连接
SELECT employee_id,last_name,salary,grade_level
FROM employees e,job_grades j
WHERE e.`salary` BETWEEN j.`lowest_sal` AND j.`highest_sal`;

#自连接
SELECT emp.employee_id,emp.last_name,mgr.employee_id,mgr.last_name
FROM employees emp,employees mgr
WHERE emp.`manager_id` = mgr.`employee_id`;
#没有员工id的仍然没有被带进来

#内连接:合并,不包括一个表与另外一个表中不匹配的
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e,departments d
WHERE e.`department_id` = d.`department_id`;#106

#查询所有的XXX就要用外连接来做
#orcle写法:WHERE e.`department_id` = d.`department_id`(+);(垫鞋垫)
#左外是额外返回左表中不满足条件的,右外是返回右表中不满足条件的
#内连接
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e INNER JOIN departments d #inner省略
ON e.`department_id` = d.`department_id`#106
JOIN locations l
ON d.`location_id` = l.`location_id`;#多表连接

#左外
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e LEFT OUTER JOIN departments d #OUTER可省略
ON e.`department_id` = d.`department_id`;#107

#满外,mysql不支持full join
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e FULL JOIN departments d 
ON e.`department_id` = d.`department_id`;