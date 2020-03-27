#14-数据处理之增删改操作

#1.添加数据
CREATE TABLE emp1(
id INT,
emp_name VARCHAR(15),
hire_date DATE,
salary DOUBLE(10,2)
)

SELECT * 
FROM emp1;

#方式一:
#注意:顺序要和表字段保持一致
INSERT INTO emp1
VALUES(1,'Tom',CURDATE(),5600);

#上面那种麻烦,开发中用的:显式指名赋值顺序
INSERT INTO emp1(id,hire_date,salary,emp_name)
VALUES(2,CURDATE(),12000,'Jerry');

INSERT INTO emp1(id,hire_date,salary,emp_name)
VALUES(3,CURDATE(),32000,'Mary');
#未声明的字段,默认会赋值为null

#方式二:基于现有的表导入数据
INSERT INTO emp1(id,emp_name,salary)
SELECT employee_id,last_name,salary#一一对应
FROM employees
WHERE department_id IN(50,60,70);#给一部分数据过去

DESC emp1;
DESC employees;


#2.删除操作:delect from...
SELECT *
FROM emp1;

#delete from emp1;//这样会全部都删掉
DELETE FROM emp1
WHERE id = 2;
#where后可以接不同的查询条件

DELETE FROM emp1
WHERE salary < 4000;

#3.修改操作:update....set

UPDATE emp1
SET salary = 6600
WHERE id = 1;

UPDATE emp1
SET salary = 7600,hire_date = '2020-07-03'
WHERE id = 1;
#创建表