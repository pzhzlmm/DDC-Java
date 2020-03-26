#1.所有有门派的人员信息 
#（ A、B两表共有）
#`t_emp``t_emp`
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
JOIN t_dept de
ON em.`deptId` = de.`id`;

#2.列出所有用户，并显示其机构信息 
 #（A的全集）
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
LEFT JOIN t_dept de
ON em.`deptId` = de.`id`;

#3.列出所有门派 
#（B的全集）
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
RIGHT JOIN t_dept de
ON em.`deptId` = de.`id`;

#4.所有不入门派的人员 
#（A的独有）
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
LEFT JOIN t_dept de
ON em.`deptId` = de.`id`
WHERE em.`deptId` IS NULL;

#5.所有没人入的门派 
#（B的独有）
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
RIGHT JOIN t_dept de
ON em.`deptId` = de.`id`
WHERE em.`id` IS NULL;

#6.列出所有人员和机构的对照关系
#(AB全有)
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
LEFT JOIN t_dept de
ON em.`deptId` = de.`id`
UNION ALL
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
RIGHT JOIN t_dept de
ON em.`deptId` = de.`id`
WHERE em.`id` IS NULL;

 
#7.列出所有没入派的人员和没人入的门派
#（A的独有+B的独有）
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
LEFT JOIN t_dept de
ON em.`deptId` = de.`id`
WHERE em.`deptId` IS NULL
UNION
SELECT em.id,em.NAME,em.age,em.`empno`,de.`deptName`,de.`address`
FROM t_emp em
RIGHT JOIN t_dept de
ON em.`deptId` = de.`id`
WHERE em.`id` IS NULL;


# 1.显示所有员工的姓名，部门号和部门名称。 所有->外连接,一般左外


# 2.查询90号部门员工的job_id和90号部门的location_id
SELECT e.`job_id`,d.`location_id`
FROM employees e JOIN departments d
ON e.`department_id` = d.`department_id`
WHERE d.`department_id` = 90;

# 3.选择所有有奖金的员工的 last_name , department_name , location_id , city
/*SELECT e.`last_name`,d.`department_id`,d.`location_id`
FROM employees e left JOIN departments d
ON e.`department_id` = d.`department_id`
LEFT join location l
on d.`location_id` = l.`location_id`
where e.`commission_pct` is not null;*/

# 4.选择city在Toronto工作的员工的 last_name , job_id , department_id , department_name 

# 5.选择指定员工的姓名，员工号，以及他的管理者的姓名和员工号，结果类似于下面的格式
