create DATABASE if not exists employee_directory;
use employee_directory;
drop table if exists employee;

create table employee(id int not null primary key AUTO_INCREMENT, 
firstname varchar(45) default null, 
lastname varchar(45) default null, 
email varchar(45) default null
);

insert into employee(firstname, lastname, email) values
('Leslie','Andrews','leslie@gmail.com'),
('Emma','Baumgarten','emma@gmail.com'),
('Avani','Gupta','avani@gmail.com'),
('Yuri','Petrov','yuri@gmail.com'),
('Juan','Vega','juan@gmail.com');

select * from employee;