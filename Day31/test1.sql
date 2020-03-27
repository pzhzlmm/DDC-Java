CREATE DATABASE test01db;
USE test01db;
CREATE TABLE books5(
	b_id INT(0),
	b_name VARCHAR(50),
	author VARCHAR(100),
	price FLOAT,
	pubdate YEAR,
	note VARCHAR(100),
	num INT(100)
);
DESC books5;

INSERT INTO books(b_id,b_name,author,price,pubdate,note,num)
VALUES(1,'Tal of AAA','Dickes',23,1995,'novel',11);

SELECT * FROM books;

INSERT INTO books
VALUES(2,'EmmaT','Jane lura',35,1993,'joke',22);

INSERT INTO books VALUES
(3,'Story of Jane','Jane Tim',40,2001,'novel',0),
(4,'Lovey Day','George Byron',20,2005,'novel',30),
(5,'Old land','Honore Blade',30,2010,'Law',0),
(6,'The Battle','Upton Sara',30,1999,'medicine',40),
(7,'Rose Hood','Richard haggard',28,2008,'cartoon',28);

