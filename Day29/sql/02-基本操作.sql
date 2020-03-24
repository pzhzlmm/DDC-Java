SELECT * 
FROM employees;

SELECT employee_id,first_name,last_name,email
FROM employees;

SELECT *
FROM departments;

SELECT *
FROM locations;

#列的别名:空格/as,有空格加双引号
SELECT employee_id id,first_name,last_name AS lname,email,salary "monthly salary"
FROM employees;

#去除重复行:加个DISTINCT
SELECT DISTINCT department_id
FROM employees;

#空值参与运算
#结论1:null参与运算,结果仍为null
#结论2:空值不同于0,'','null'
SELECT employee_id,last_name,commission_pct,salary,salary * (1 + IFNULL(commission_pct,0)) "月工资"
FROM employees;

#显示表结构
DESC employees;
DESCRIBE employees;

