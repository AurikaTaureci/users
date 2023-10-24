CREATE SCHEMA empl;
use empl;
drop table if exists employee;

CREATE TABLE "user"(
id tinyint not null primary key auto_increment,
username varchar(180) not null,
password varchar(20) not null,
role varchar(20) not null
);

use empl;

INSERT INTO empl."user"(username,password,role) VALUES('user1','1234','USER');
INSERT INTO empl."user"(username,password,role) VALUES('user2','5678','ADMIN');
INSERT INTO empl."user"(username,password,role) VALUES('user3','2468','ADMIN');