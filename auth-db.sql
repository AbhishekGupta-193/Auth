create table users (
	id serial primary key,
	mobile_no varchar(10)not null,
	name varchar(50) not null
);

INSERT into users (mobile_no,name) values
('7992417318', 'Abhishek Gupta'),
('8765432109', 'Jane Smith'),
('7654321098', 'Alice Johnson'),
('6543210987', 'Bob Brown'),
('5432109876', 'Charlie Davis'),
('4321098765', 'Eve White');

select * from users;

ALTER TABLE users ADD COLUMN password VARCHAR(255);

UPDATE users set password='abcd' where id=1;
UPDATE users set password='bcde' where id=2;
UPDATE users set password='defg' where id=3;
UPDATE users set password='ghij' where id=4;
UPDATE users set password='hijk' where id=5;
UPDATE users set password='ijkl' where id=6;
UPDATE users set password='1234' where id=17;
