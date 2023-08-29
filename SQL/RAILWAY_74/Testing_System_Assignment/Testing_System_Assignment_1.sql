-- creat database 
DROP DATABASE IF EXISTS testing_system ;
CREATE DATABASE testing_system ;
USE testing_system ;

-- creat table Department
CREATE TABLE IF NOT EXISTS Department (
    Department_ID    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name  VARCHAR(50) 
);

-- creat table Position
CREATE TABLE IF NOT EXISTS `Position` (
    Position_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Position_Name    ENUM('Dev', 'Test', 'Scrum Master', 'PM') 
);

-- creat table Account
CREATE TABLE IF NOT EXISTS `Account` (
    Account_ID       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email            VARCHAR(100) ,
    Username         VARCHAR(50) ,
    Fullname         VARCHAR(50) ,
    Department_ID    INT UNSIGNED ,
    Position_ID      INT UNSIGNED ,
    Create_Date      DATETIME DEFAULT NOW()
);

-- creat table Group
CREATE TABLE IF NOT EXISTS `Group` (
    Group_ID         INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Group_Name       VARCHAR(50) ,
    Creator_ID       INT UNSIGNED,
    Create_Date      DATETIME DEFAULT NOW()
);

-- creat table GroupAccount
CREATE TABLE IF NOT EXISTS Group_Account (
    Group_ID         INT UNSIGNED ,
    Account_ID       INT UNSIGNED ,
    Join_Date        DATETIME DEFAULT NOW()
);

-- creat table Type Question
CREATE TABLE IF NOT EXISTS Type_Question (
    Type_ID          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Type_Name        ENUM('Essay', 'Multiple-Choice') 
);

-- creat table Category Question
CREATE TABLE IF NOT EXISTS Category_Question (
    Category_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Category_Name    VARCHAR(100) 
);

-- creat table Question
CREATE TABLE IF NOT EXISTS Question (
    Question_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content          TEXT ,
    Category_ID      INT UNSIGNED ,
    Type_ID          INT UNSIGNED ,
    Creator_ID       INT UNSIGNED ,
    Create_Date      DATETIME DEFAULT NOW()
);

-- creat table Answer
CREATE TABLE IF NOT EXISTS Answer (
    Answer_ID        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content          VARCHAR(255) ,
    Question_ID      INT UNSIGNED ,
    is_Correct       ENUM('TRUE', 'FALSE')
);

-- creat table Exam
CREATE TABLE IF NOT EXISTS Exam (
    Exam_ID          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`           CHAR(10) ,
    Title            VARCHAR(255) ,
    Category_ID      INT UNSIGNED ,
    Duration         INT UNSIGNED ,
    Creator_ID       INT UNSIGNED ,
    Create_Date      DATETIME DEFAULT NOW()
);

-- creat table Exam Question
CREATE TABLE IF NOT EXISTS Exam_Question (
    Exam_ID           INT UNSIGNED ,
    Question_ID       INT UNSIGNED 
);