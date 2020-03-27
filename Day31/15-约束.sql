#15-约束
#1.正对表中的数据,进行额外的限制,就称之为约束
#2.约束的分类
/*2.1从功能上分:
not null 非空约束
unique:唯一性约束
primary key:主键约束
check:检查约束
default:默认值约束

2.2 角度二:约束的作用范围,声明位置:
列级约束 vs  表级约束

2.3 角度三:从约束作用的列的个数:
单例约束和多列约束
*/

#3.如何使用约束:
#情况一:在create table的时候,与创建表的字段同时执行
#情况二:在alter table的时候增改约束

#4. not null:非空约束:只能使用列级约束
CREATE TABLE emp2(
id INT NOT NULL,#列级约束
emp_name VARCHAR(15) NOT NULL,
salary DOUBLE(10,2),
email VARCHAR(25)
);

DESC emp2;

INSERT INTO emp2(id,emp_name,salary,email)
VALUES(1,'Tom',1000,'djis@163.com');

SELECT * 
FROM emp2;

#删除约束
ALTER TABLE emp2
MODIFY id INT NULL;

INSERT INTO emp2(id,emp_name,salary,email)
VALUES(2,'null',1000,NULL);

#添加约束
ALTER TABLE emp2
MODIFY id INT NOT NULL;


#5.unique约束
#创建表的同时,添加约束
CREATE TABLE emp3(
id INT UNIQUE,#列级约束
emp_name VARCHAR(15),
salary DOUBLE(10,2),
email VARCHAR(25),
#声明后在最后一句,即表级约束
CONSTRAINT emp3_email_uk UNIQUE(email)
);
SELECT * 
FROM emp3;

INSERT INTO emp3(id,emp_name,email,salary)
VALUE(3,'',NULL,1200);
INSERT INTO emp3(id,emp_name,email,salary)
VALUE(4,'',NULL,1200);
#结论:声明为unique的字段的多行数据是可以多次赋值为null的

#删除唯一性约束:
/*
- 声明为唯一性约束的字段上,会自动添加索引
- 删除唯一约束只能通过删除唯一索引的方式删除。
- 删除时需要指定唯一索引名，唯一索引名就和唯一约束名一样。
- 如果创建唯一约束时未指定名称，如果是单列，就默认和列名相同，如果是组合列，那么默认和()中排在第一个的列名相同。也可以自定义唯一性约束名。
*/
#删除约束
ALTER TABLE emp3
DROP INDEX id;

ALTER TABLE emp3
#添加约束
ADD CONSTRAINT emp3_id UNIQUE(id);

#6.primary key约束
# 主键约束作用的列满足:非空且唯一
# 好处:通过主键作用的列,查询数据的话可以唯一定位表中的一条记录
# 限制:表中只允许最多定义一个主键约束

CREATE TABLE emp5(
id INT,#id int primary key 列级约束,一般会加上auto_increment
emp_name VARCHAR(15),
salary DOUBLE(10,2),
email VARCHAR(25),
#表级约束
CONSTRAINT emp5_id_pk PRIMARY KEY(id)
);

INSERT INTO emp5(id,emp_name,email,salary)
VALUE(3,'',"108494@ww/cp,",1200);

DESC emp5;

CREATE TABLE emp6(
id INT PRIMARY KEY AUTO_INCREMENT,
emp_name VARCHAR(15),
salary DOUBLE(10,2),
email VARCHAR(25)
);
INSERT INTO emp6(emp_name,email,salary)
VALUE('momo',"108494@ww/cp,",1200);
INSERT INTO emp6(emp_name,email,salary)
VALUE('lala',"108494@ww/cp,",1200);
SELECT *
FROM emp6;


#删除主键约束
DESC emp5;
ALTER TABLE emp5
DROP PRIMARY KEY;

#添加主键约束
ALTER TABLE emp5
ADD CONSTRAINT emp5_id_pk PRIMARY KEY(id);
/*ALTER TABLE USER 
ADD UNIQUE(NAME,PASSWORD);
联合主键
*/

# 7. 外键约束:参照列必须是主键或者有唯一性约束
CREATE TABLE dept06(
dept_id INT,
dept_name VARCHAR(10)
);

ALTER TABLE dept06
ADD CONSTRAINT dept06_id_pk PRIMARY KEY(dept_id);

DESC dept06;

CREATE TABLE emp06(
id INT,
emp_name VARCHAR(15),
dept_id INT,
#表级约束
CONSTRAINT emp06_dept_id_fk FOREIGN KEY(dept_id) REFERENCES dept06(dept_id)
);

DESC emp06;

#添加 
INSERT INTO dept06(dept_id,dept_name)
VALUES(10,'IT');

INSERT INTO emp06(id,emp_name,dept_id)
VALUES(1,'tom',10);

DELETE FROM dept06
WHERE dept_id = 10;

UPDATE dept06
SET dept_id = 06
WHERE dept_id = 10
#以上删除修改都不会成功,因为10号外键是被引用的

#级联删除 ,指向的数据都删除,级联置空,把指向的都置空
#删除外键直接drop就可以了

#8-检查约束check
# mysql中check约束失效,orcle中有效
CREATE TABLE emp7(
id INT,
emp_name VARCHAR(15),
salary DOUBLE(10,2) CHECK (salary > 3000)
);
INSERT emp7 VALUE (1,'tom',2000);#是可以添加成功的,mysql失效
SELECT * FROM emp7;

#9-默认值约束,default
CREATE TABLE emp8(
id INT,
emp_name VARCHAR(15),
salary DOUBLE(10,2) DEFAULT 2000
);

INSERT emp8(id,emp_name)
VALUES(1,'tom');

SELECT *
FROM emp8;

#视图:存储起来的sql语句