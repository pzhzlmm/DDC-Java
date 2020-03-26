#07-七种join操作

#内
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e JOIN departments d 
ON e.`department_id` = d.`department_id`;

#左外
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e LEFT JOIN departments d 
ON e.`department_id` = d.`department_id`;

#右外
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e RIGHT JOIN departments d 
ON e.`department_id` = d.`department_id`;

#左中
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e LEFT JOIN departments d 
ON e.`department_id` = d.`department_id`
WHERE d.`department_id` IS NULL;

#右中
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e LEFT JOIN departments d 
ON e.`department_id` = d.`department_id`
WHERE e.`department_id`IS NULL;

#mysql中的满外 
#UNION A + B  
#UNION ALL A + B - AB 常用,没有额外的去重操作
#左中
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e LEFT JOIN departments d 
ON e.`department_id` = d.`department_id`
WHERE d.`department_id` IS NULL
UNION ALL
#右外
SELECT employee_id,last_name,department_name,e.`department_id`
FROM employees e RIGHT JOIN departments d 
ON e.`department_id` = d.`department_id`;

