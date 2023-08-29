-- creat database 
DROP DATABASE IF EXISTS testing_system ;
CREATE DATABASE testing_system ;
USE testing_system ;

-- creat table 1 Department
CREATE TABLE IF NOT EXISTS Department (
    department_id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    department_name  NVARCHAR(50) NOT NULL UNIQUE KEY
);
INSERT INTO department 			  (	department_name		)
VALUE									  (	 N'Marketing'			),
										  (	 N'Sale'					),
                                (	 N'IT'					),
                                (	 N'HR'					),
                                (	 N'Tech'					),
                                (	 N'Finance'				),
                                (	 N'Director'			),
                                (	 N'Planning'			),
                                (	 N'Logistic'			),
                                (	 N'Purchase'			);

-- creat table 2 Position
CREATE TABLE IF NOT EXISTS `Position` (
    position_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    position_name    ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE KEY
);

INSERT INTO `Position`		 	  (	position_name		)
VALUE									  (	  'Dev'				),
										  (	  'Test'				),
                                (	  'Scrum Master'	),
                                (	  'PM'				);

-- creat table 3 Account
CREATE TABLE IF NOT EXISTS `Account` (
    account_id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email            VARCHAR(100) NOT NULL UNIQUE KEY,
    username         VARCHAR(50) NOT NULL UNIQUE KEY,
    fullname         NVARCHAR(50) NOT NULL UNIQUE KEY,
    department_id    INT UNSIGNED NOT NULL,
    position_id      INT UNSIGNED NOT NULL,
    create_date      DATE DEFAULT NOW(),
    FOREIGN KEY (department_id) REFERENCES Department (department_id),
    FOREIGN KEY (position_id) REFERENCES `Position` (position_id)
);

INSERT INTO `Account` 	(			email 					 , username			,fullname			,department_id	,position_id	,	create_date		 )
VALUE							(	'puppy＠gmail.com' 			, 'puppy'			,N'Lã Bất Vi'		,	6				,	1				,	'2019-03-05'	),
								(	'kitten＠gmail.com' 			,	'kitten'			,N'Lưu Bang'		,	4				,	2				,	'2018-02-07'	),
                        (	'hamster＠gmail.com' 			, 'hamster'			,N'Doanh To'		,	2				,	3				,	'2017-09-09'	),
                        (	'goldfish＠gmail.com' 		, 'goldfish'		,N'Hàn Tín'			,	2				,	4				,	'2016-12-11'	),
                        (	'turkey＠gmail.com' 			, 'turkey'			,N'Hạng Vũ'			,	1				,	4				,	'2015-01-13'	),
                        (	'horse＠gmail.com' 			, 'horse'			,N'Gia Cát Lượng' , 	3				,	3				,	'2014-04-12'	),
                        (	'rooster＠gmail.com' 			, 'rooster'			,N'Trần Bình	'	,	7				,	2				,	'2013-06-08'	),
                        (	'buffalo＠gmail.com' 			, 'buffalo'			,N'Chu Li Muội'	,	8				,	1				,	'2015-08-04'	),
                        (	'rhinoceros＠gmail.com' 		, 'rhinoceros  '	,N'Quí Bố'			,	9				,	4				,	'2016-10-02'	),
                        (	'hippopotamus＠gmail.com' 	, 'hippopotamus'  , N'Tiêu Hà'		,	10				,	1				,	'2017-05-21'	);

-- creat table 4 Group
CREATE TABLE IF NOT EXISTS `Group` (
    group_id         INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    group_name       VARCHAR(50) NOT NULL UNIQUE KEY,
    creator_id       INT UNSIGNED,
    create_date      DATE DEFAULT NOW(),
    FOREIGN KEY (creator_id) REFERENCES `Account` (account_id)
);

INSERT INTO `Group` 		    (	group_name 		, 	creator_id		,	create_date			)
VALUE							    (	'starbuck'		, 		1				,	'2019-03-05'		),
								  	 (	'docomo'			, 		2				,	'2017-05-07'		),
                            (	'softbank'		, 		3				,	'2015-07-09'		),
                            (	'au'				, 		4				,	'2013-09-11'		),
                            (	'viettel'		, 		5				,	'2011-10-13'		),
                            (	'mobifone'		, 		10				,	'2010-12-12'		),
                            (	'vinaphone'		, 		9				,	'2012-08-10'		),
                            (	'gucci'			, 		8				,	'2014-06-08'		),
                            (	'nike'			, 		7				,	'2016-04-06'		),
                            (	'adidas'			, 		6				,	'2018-02-04'		);
                            

-- creat table 5 GroupAccount
CREATE TABLE IF NOT EXISTS Group_Account (
    group_id         INT UNSIGNED NOT NULL,
    account_id       INT UNSIGNED NOT NULL,
    join_date        DATE DEFAULT NOW(),
    PRIMARY KEY (group_id,account_id),-- Group_ID và  Account_ID tạo thành Primary key
    FOREIGN KEY (group_id) REFERENCES `Group` (group_id),
    FOREIGN KEY (account_id) REFERENCES `Account` (account_id)
);

INSERT INTO group_account 		  (	group_id		, account_id	, join_date		)
VALUE									  (		1			, 	  1			, '2019-03-05'	),
										  (		2			, 	  2			, '2018-04-06'	),
                                (		3			, 	  3			, '2017-05-06'	),
                                (		4			, 	  4			, '2016-06-08'	),
                                (		5			, 	  5			, '2014-07-09'	),
                                (		6			, 	  6			, '2013-08-10'	),
                                (		7			, 	  7			, '2012-09-11'	),
                                (		8			, 	  8			, '2011-10-12'	),
                                (		9			, 	  9			, '2010-11-13'	),
                                (		10			, 	  10		 	, '2009-12-14'	),
                                (		1			, 	  10			, '2019-03-05'	);
                                
 
-- creat table 6 Type Question
CREATE TABLE IF NOT EXISTS Type_Question (
    type_id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    type_name        ENUM('Essay', 'Multiple-Choice') NOT NULL UNIQUE KEY
);

INSERT INTO Type_Question 		(	 	type_name				)
VALUE									(		 'Essay'					),
										(	 	 'Multiple-Choice'	);
                                

-- creat table 7 Category Question
CREATE TABLE IF NOT EXISTS Category_Question (
    category_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    category_name    VARCHAR(100) NOT NULL UNIQUE KEY
);

INSERT INTO Category_Question 		( 	category_name			)
VALUE											(		'HTML'				),
												( 	  	'JavaScript'		),
												(	  	'CSS'					),
												( 	  	'PHP'					),
												(		'Python'				),
												(		'React'				),
												(		'SQL'					),
												(		'ASP'					),
												(		'AI'					),
												(		'C++'					);

-- creat table 8 Question
CREATE TABLE IF NOT EXISTS Question (
    question_id      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content          TEXT NOT NULL ,
    category_id      INT UNSIGNED NOT NULL,
    type_id          INT UNSIGNED NOT NULL,
    creator_id       INT UNSIGNED NOT NULL,
    create_date      DATE DEFAULT NOW(),
    FOREIGN KEY (category_id) REFERENCES Category_Question (category_id),
    FOREIGN KEY (type_id) REFERENCES Type_Question (type_id),
    FOREIGN KEY (creator_id) REFERENCES `Account` (account_id)
);

INSERT INTO question 		 (	content						, 	category_id	,	type_id		,	creator_id		,	create_date				)
VALUE								 (	'Câu hỏi về HTML'			, 		1			,		1			,		1				,	'2019-03-05'			),
									 (	'Câu đố  về JavaScript'	, 		2			,		1			,		1				,	'2018-05-07'			),
                            (	'Câu hỏi về CSS'			, 		3			,		2			,		2				,	'2017-07-09'			),
                            (	'Câu đố  về PHP'			, 		4			,		2			,		3				,	'2016-09-11'			),
                            (	'Câu hỏi về Python'		, 		5			,		1			,		4				,	'2020-11-13'			),
                            (	'Câu đố  về React'		, 		10			,		1			,		10				,	'2011-12-15'			),
                            (	'Câu hỏi về SQL'			, 		9			,		2			,		9				,	'2013-10-17'			),
                            (	'Câu đố  về ASP'			, 		8			,		2			,		8				,	'2015-08-19'			),
                            (	'Câu hỏi về AI'			, 		7			,		1			,		7				,	'2014-06-21'			),
                            (	'Câu đố  về C++'			, 		6			,		2			,		6				,	'2012-04-23'			);

-- creat table 9 Answer
CREATE TABLE IF NOT EXISTS Answer (
    answer_id        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content          NVARCHAR(255) NOT NULL,
    question_id      INT UNSIGNED NOT NULL,
    is_correct       ENUM('TRUE', 'FALSE'),
    FOREIGN KEY (question_id) REFERENCES Question (question_id)
);

INSERT INTO answer 			 (	content			, 	question_id		,	is_correct				)
VALUE								 (	N'Trả lời 01'	, 		1				,		'FALSE'				),
									 (	N'Trả lời 02'	, 		1				,		'TRUE'				),
                            (	N'Trả lời 03'	, 		1				,		'FALSE'				),
                            (	N'Trả lời 04'	, 		3				,		'TRUE'				),
                            (	N'Trả lời 05'	, 		5				,		'FALSE'				),
                            (	N'Trả lời 06'	, 		10				,		'TRUE'				),
                            (	N'Trả lời 07'	, 		9				,		'TRUE'				),
                            (	N'Trả lời 08'	, 		8				,		'FALSE'				),
                            (	N'Trả lời 09'	, 		7				,		'TRUE'				),
                            (	N'Trả lời 10'	, 		1				,		'FALSE'				);
                            

-- creat table 10 Exam
CREATE TABLE IF NOT EXISTS Exam (
    exam_id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `code`           CHAR(10) NOT NULL,
    title            NVARCHAR(255) NOT NULL,
    category_id      INT UNSIGNED NOT NULL,
    duration         INT UNSIGNED NOT NULL,
    creator_id       INT UNSIGNED NOT NULL,
    create_date      DATE DEFAULT NOW(),
    FOREIGN KEY (category_id) REFERENCES Category_Question (category_id),
    FOREIGN KEY (creator_id) REFERENCES `Account` (account_id)
);

INSERT INTO exam	 			 (	`code` 	, title						,	category_id		,  duration	,	creator_id		,	create_date		)
VALUE								 (	'VTI001'	,N'Đề thi HTML'			, 		1				,	60			,		1				,	'2019-12-05'	),
									 (	'VTI002'	,N'Đề thi JavaScript'	, 		2				,	90			,		1				,	'2018-11-07'	),
                            (	'VTI003'	,N'Đề thi CSS'				, 		3				,	120		,		2				,	'2017-10-09'	),
                            (	'VTI004'	,N'Đề thi PHP'				, 		4				,	60			,		3				,	'2016-09-11'	),
                            (	'VTI005'	,N'Đề thi Python'			,		5				,	90			,		4				,	'2020-08-13'	),
                            (	'VTI006'	,N'Đề thi React'			, 		10				,	120		,		10				,	'2011-07-15'	),
                            (	'VTI007'	,N'Đề thi SQL'				, 		9				,	60			,		9				,	'2013-01-17'	),
                            (	'VTI008'	,N'Đề thi ASP'				, 		8				,	90			,		8				,	'2015-02-19'	),
                            (	'VTI009'	,N'Đề thi AI'				, 		7				,	120		,		7				,	'2014-03-21'	),
                            (	'VTI010'	,N'Đề thi C++'				, 		6				,	60			,		6				,	'2012-04-23'	);

-- creat table 11 Exam Question
CREATE TABLE IF NOT EXISTS Exam_Question (
    exam_id           INT UNSIGNED NOT NULL,
    question_id       INT UNSIGNED NOT NULL,
    PRIMARY KEY (exam_id,question_id),
    FOREIGN KEY (exam_id) REFERENCES Exam (exam_id),
    FOREIGN KEY (question_id) REFERENCES Question (question_id)
);

INSERT INTO exam_question 			(	exam_id 		, 	question_id		)
VALUE										(		1			, 	  10				),
											(		2			, 	  9				),
                                 (		3			, 	  8				),
                                (		4			, 	  7				),
                                (		5			, 	  6				),
                                (		6			, 	  1				),
                                (		7			, 	  2				),
                                (		8			, 	  3				),
                                (		9			, 	  4				),
                                (		10			, 	  5				);
