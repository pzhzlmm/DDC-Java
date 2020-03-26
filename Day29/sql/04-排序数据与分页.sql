#04-排序数据与分页

#1.排序数据
#默认按照添加顺序排,
#1.1 使用order by排序,默认升序
#排序方式: 升序(ascend):asc  降序(descend):desc
SELECT employee_id,last_name,salary,hire_date 
FROM employees
#order by salary asc;
#order by salary desc;
#order by last_name desc;
ORDER BY hire_date DESC;


#1.2 使用列的别名来进行排序,但是不能用在where的过滤条件之中
SELECT employee_id,last_name,salary monthly_sal,hire_date 
FROM employees
#where monthly_sal > 5000 在where里执行会出错
ORDER BY monthly_sal ASC;


#1.3 二级排序
SELECT employee_id,last_name,department_id
FROM employees
ORDER BY department_id ASC,last_name DESC;#先按照部门id排,再然后按照部门id进行排序

#2. 分页
#按照员工的薪资从高到低排序,每页显示10条数据,显示第一页数据:TOP10
SELECT employee_id,last_name,salary,department_id
FROM employees
ORDER BY salary DESC
#分页:显示第一页
#limit 0,10;
#分页:显示第二页
#LIMIT 10,10;
#分页:显示第三页
LIMIT 20,10;
#公式,每页显示pagiSize,第pageNo页
#LIMIT (pageNo-1) * pagiSize,pagesize


