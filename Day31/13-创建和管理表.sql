#13-创建和管理表

#1.1如何创建数据库
CREATE DATABASE myemp;

#1.2.选中要操作的数据库
USE myemp;

#1.3.显示当前数据库下的所有表
SHOW TABLES;

#2.如何创建表
USE temp;
#方式一:
CREATE TABLE emp1(
id INT,#最大四个字节,数字:2147483647
emp_name VARCHAR(15),#可变长度,定义多少就是多长,但最多不能超过15个字符,长度必须指明,char可不指明,默认1个字符
hire_date DATE,
salary DOUBLE(10,2)#10位,其中两位是小数,其他的是整数
);

SELECT *
FROM emp1;

DESC emp1;
INSERT emp1(id)
VALUES(2147483647);


#方式二:
#基于现有的表来创建新的表
#数据类型和存储范围和原表相同
CREATE TABLE emp2
AS
SELECT employee_id,last_name,salary
FROM employees;

DESC emp2;
#还可以换名字
CREATE TABLE emp3
AS
SELECT employee_id empid,last_name,salary#相当于定义了个别名
FROM employees;

DESC emp3;

#复制表,包含数据
CREATE  TABLE employee_copy
AS
SELECT *
FROM employees;

#复制表,但不包含数据
CREATE  TABLE employee_copy_blank
AS
SELECT *
FROM employees
#where department_id = 10000 #找一个没有数据的部门进行创建
WHERE 1 = 2;

#3.修改表
DESC emp1;

#3.1 增加一个列
ALTER TABLE emp1
ADD emial VARCHAR(25);

#3.2 删除一个列(表结构用drop)
ALTER TABLE emp1
DROP COLUMN emial;

#3.3 重命名
ALTER TABLE emp1
CHANGE salary monthly_salaty DOUBLE(11,2);

#3.4 修改一个列
#说明:一般不会改数据类型,因为怕表里已有数据,一般只是调整其存储范围
ALTER TABLE emp1
MODIFY emp_name VARCHAR(20);

#4. 重命名表
RENAME TABLE emp1
TO myemp1;

DESC myemp1;

#5. 删除表
DROP TABLE myemp1;
DROP TABLE employee_copy;

#6.清空表:删除数据,保留表结构
TRUNCATE TABLE emp3;
DESC emp3;
/*
删除表数据:delete from 和清空表 truncate table 区别:
结论:truncate table 不可回滚
	delete from 可以回滚,可以指定删某一条,或者某几条数据
DCL:commit/rollback 
commit:提交数据,一旦数据提交,就不可回滚
rollback:回滚操作,将数据回滚到最后的一次commit之后

delete from:默认情况下,会自动提交数(提交后回滚失效)
而我们可以set autocommit = false;
*/
SET autocommit = FALSE;

SELECT *
FROM employee_copy;

DELETE FROM employee_copy;

TRUNCATE TABLE employee_copy;

DROP TABLE employee_copy;

ROLLBACK;

#TRUNCATE失效本质
#需要恢复到指定的数据或时间点，需要全备加日志
#DDL:都是不可回滚数据的,本质上是因为DDL操作之后都会自动地提交数据,不受set autocommit = false影响
#DML:都是可以回滚数据的,受set autocommit = false影响,但默认是true
