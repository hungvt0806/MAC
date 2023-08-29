-- creat database 
DROP DATABASE IF EXISTS hr ;
CREATE DATABASE hr ;
USE hr ;

-- creat table Manager
CREATE TABLE IF NOT EXISTS `User` (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fullname VARCHAR(100) NOT NULL UNIQUE KEY,
    email VARCHAR(100) NOT NULL UNIQUE KEY,
    `password` VARCHAR(100) NOT NULL UNIQUE KEY,
    project_id INT,
    exp_in_year INT,
    pro_skill VARCHAR(50),
     `role` VARCHAR(10) NOT NULL
);

INSERT INTO User (email, fullname, `password`, project_id, exp_in_year, pro_skill, `role`)
VALUES ('puppy.nguyen@vti.com.vn', 'Nguyen Van A', '123456', 1, 10, NULL, 'manager'),
       ('kitten.tran@vti.com.vn)', 'Tran Van B', '1234567', 2, 7, NULL, 'manager'),
       ('hamster.truong@vti.com.vn', 'Truong Ngoc C', '12345678', 1, NULL, 'dev', 'employee'),
       ('goldfish.vu@vti.com.vn)', 'Vu Thai D', '123456789', 1, NULL, 'test', 'employee'),
       ('turkey.dao@vti.com.vn)', 'Dao Thi E', '1234567899', 2, NULL, 'java', 'employee'),
       ('horsen.luu@vti.com.vn)', 'Luu Ngoc F', '12345678999', 2, NULL, 'sql', 'employee');
