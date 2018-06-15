CREATE DATABASE finalpoo;

USE finalpoo;

CREATE TABLE Login (
	lg_id int NOT NULL,
	lg_login varchar(15),
	lg_senha varchar(15)
);

INSERT INTO Login values (1, 'Admin', '123');