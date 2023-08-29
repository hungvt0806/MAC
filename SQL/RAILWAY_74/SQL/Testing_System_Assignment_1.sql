-- creat table Department
CREATE TABLE IF NOT EXISTS Department (
    department_id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    department_name  VARCHAR(50) 
);

-- creat table Position
CREATE TABLE IF NOT EXISTS `Position` (
    position_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    position_name    ENUM('Dev', 'Test', 'Scrum Master', 'PM') 
);

-- creat table Account
CREATE TABLE IF NOT EXISTS `Account` (
    account_id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email            VARCHAR(100) ,
    username         VARCHAR(50) ,
    fullname         VARCHAR(50) ,
    department_id    INT UNSIGNED ,
    position_id      INT UNSIGNED ,
    create_date      DATETIME DEFAULT NOW()
);

-- creat table Group
CREATE TABLE IF NOT EXISTS `Group` (
    group_id         INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    group_name       VARCHAR(50) ,
    creator_id       INT UNSIGNED,
    create_date      DATETIME DEFAULT NOW()
);

-- creat table GroupAccount
CREATE TABLE IF NOT EXISTS Group_Account (
    group_id         INT UNSIGNED ,
    account_id       INT UNSIGNED ,
    join_date        DATETIME DEFAULT NOW()
);

-- creat table Type Question
CREATE TABLE IF NOT EXISTS Type_Question (
    type_id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    type_name        ENUM('Essay', 'Multiple-Choice') 
);

-- creat table Category Question
CREATE TABLE IF NOT EXISTS Category_Question (
    category_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    category_name    VARCHAR(100) 
);

-- creat table Question
CREATE TABLE IF NOT EXISTS Question (
    question_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content          TEXT ,
    category_id      INT UNSIGNED ,
    type_id          INT UNSIGNED ,
    creator_id       INT UNSIGNED ,
    create_date      DATETIME DEFAULT NOW()
);

-- creat table Answer
CREATE TABLE IF NOT EXISTS Answer (
    answer_id        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content          VARCHAR(255) ,
    question_id      INT UNSIGNED ,
    is_correct       ENUM('TRUE', 'FALSE')
);

-- creat table Exam
CREATE TABLE IF NOT EXISTS Exam (
    exam_id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `code`           CHAR(10) ,
    title            VARCHAR(255) ,
    category_id      INT UNSIGNED ,
    duration         INT UNSIGNED ,
    creator_id       INT UNSIGNED ,
    create_date      DATETIME DEFAULT NOW()
);

-- creat table Exam Question
CREATE TABLE IF NOT EXISTS Exam_Question (
    exam_id           INT UNSIGNED ,
    question_id       INT UNSIGNED 
);