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

