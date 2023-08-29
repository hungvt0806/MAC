-- creat database 
DROP DATABASE IF EXISTS testing_system ;
CREATE DATABASE testing_system ;
USE testing_system ;

-- creat table 1 Department
CREATE TABLE IF NOT EXISTS Department (
    Department_ID    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name  NVARCHAR(50) NOT NULL UNIQUE KEY
);accountaccount
INSERT INTO Department 			(	Department_Name			)
VALUE							(	 N'Marketing'			),
								(	 N'Sale'				),
                                (	 N'IT'					),
                                (	 N'HR'					),
                                (	 N'Tech'				),
                                (	 N'Finance'				),
                                (	 N'Director'			),
                                (	 N'Planning'			),
                                (	 N'Logistic'			),
                                (	 N'Purchase'			);

-- creat table 2 Position
CREATE TABLE IF NOT EXISTS `Position` (
    Position_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Position_Name    ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE KEY
);

INSERT INTO `Position`		 	(	Position_Name		)
VALUE							(	  'Dev'				),
								(	  'Test'			),
                                (	  'Scrum Master'	),
                                (	  'PM'				);

-- creat table 3 Account
CREATE TABLE IF NOT EXISTS `Account` (
    Account_ID       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email            VARCHAR(100) NOT NULL UNIQUE KEY,
    Username         VARCHAR(50) NOT NULL UNIQUE KEY,
    Fullname         NVARCHAR(50) NOT NULL UNIQUE KEY,
    Department_ID    INT UNSIGNED NOT NULL,
    Position_ID      INT UNSIGNED NOT NULL,
    Create_Date      DATETIME DEFAULT NOW(),
    FOREIGN KEY (Department_ID) REFERENCES Department (Department_ID),
    FOREIGN KEY (Position_ID) REFERENCES `Position` (Position_ID)
);

INSERT INTO `Account` 	(			Email 				, Username		,Fullname		,Department_ID	,Position_ID	,	Create_Date		)
VALUE					(	'puppy＠gmail.com' 			, 'puppy'		,N'Lã Bất Vi'	,	6			,	1			,	'2019-03-05'	),
						(	'kitten＠gmail.com' 		, 'kitten'		,N'Lưu Bang'	,	4			,	2			,	'2018-02-07'	),
                        (	'hamster＠gmail.com' 		, 'hamster'		,N'Doanh To'	,	2			,	3			,	'2017-09-09'	),
                        (	'goldfish＠gmail.com' 		, 'goldfish'	,N'Hàn Tín'		,	2			,	4			,	'2016-12-11'	),
                        (	'turkey＠gmail.com' 		, 'turkey'		,N'Hạng Vũ'		,	1			,	4			,	'2015-01-13'	),
                        (	'horse＠gmail.com' 			, 'horse'		,N'Gia Cát Lượng',	3			,	3			,	'2014-04-12'	),
                        (	'rooster＠gmail.com' 		, 'rooster'		,N'Trần Bình'	,	7			,	2			,	'2013-06-08'	),
                        (	'buffalo＠gmail.com' 		, 'buffalo'		,N'Chu Li Muội'	,	8			,	1			,	'2015-08-04'	),
                        (	'rhinoceros＠gmail.com' 	, 'rhinoceros'	,N'Quí Bố'		,	9			,	4			,	'2016-10-02'	),
                        (	'hippopotamus＠gmail.com' 	, 'hippopotamus',N'Tiêu Hà'		,	10			,	1			,	'2017-05-21'	);

-- creat table 4 Group
CREATE TABLE IF NOT EXISTS `Group` (
    Group_ID         INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Group_Name       VARCHAR(50) NOT NULL UNIQUE KEY,
    Creator_ID       INT UNSIGNED,
    Create_Date      DATETIME DEFAULT NOW(),
    FOREIGN KEY (Creator_ID) REFERENCES `Account` (Account_ID)
);

INSERT INTO `Group` 		(	Group_Name 		, 	Creator_ID		,	Create_Date			)
VALUE						(	'starbuck'		, 		1			,	'2019-03-05'		),
							(	'docomo'		, 		2			,	'2017-05-07'		),
                            (	'softbank'		, 		3			,	'2015-07-09'		),
                            (	'au'			, 		4			,	'2013-09-11'		),
                            (	'viettel'		, 		5			,	'2011-10-13'		),
                            (	'mobifone'		, 		10			,	'2010-12-12'		),
                            (	'vinaphone'		, 		9			,	'2012-08-10'		),
                            (	'gucci'			, 		8			,	'2014-06-08'		),
                            (	'nike'			, 		7			,	'2016-04-06'		),
                            (	'adidas'		, 		6			,	'2018-02-04'		);
                            

-- creat table 5 GroupAccount
CREATE TABLE IF NOT EXISTS Group_Account (
    Group_ID         INT UNSIGNED NOT NULL,
    Account_ID       INT UNSIGNED NOT NULL,
    Join_Date        DATETIME DEFAULT NOW(),
    PRIMARY KEY (Group_ID,Account_ID),-- Group_ID và  Account_ID tạo thành Primary key
    FOREIGN KEY (Group_ID) REFERENCES `Group` (Group_ID),
    FOREIGN KEY (Account_ID) REFERENCES `Account` (Account_ID)
);

INSERT INTO Group_Account 		(	Group_ID		, Account_ID	, Join_Date		)
VALUE							(		1			, 	  1			, '2019-03-05'	),
								(		2			, 	  2			, '2018-04-06'	),
                                (		3			, 	  3			, '2017-05-06'	),
                                (		4			, 	  4			, '2016-06-08'	),
                                (		5			, 	  5			, '2014-07-09'	),
                                (		6			, 	  6			, '2013-08-10'	),
                                (		7			, 	  7			, '2012-09-11'	),
                                (		8			, 	  8			, '2011-10-12'	),
                                (		9			, 	  9			, '2010-11-13'	),
                                (		10			, 	  10		, '2009-12-14'	),
                                (		1			, 	  10		, '2019-03-05'	);
                                
 
-- creat table 6 Type Question
CREATE TABLE IF NOT EXISTS Type_Question (
    Type_ID          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Type_Name        ENUM('Essay', 'Multiple-Choice') NOT NULL UNIQUE KEY
);

INSERT INTO Type_Question 		(	 	Type_Name				)
VALUE							(		 'Essay'				),
								(	 	 'Multiple-Choice'		);
                                

-- creat table 7 Category Question
CREATE TABLE IF NOT EXISTS Category_Question (
    Category_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Category_Name    VARCHAR(100) NOT NULL UNIQUE KEY
);

INSERT INTO Category_Question 		( 	Category_Name			)
VALUE								(		'HTML'				),
									( 	  	'JavaScript'		),
									(	  	'CSS'				),
									( 	  	'PHP'				),
									(		'Python'			),
									(		'React'				),
									(		'SQL'				),
									(		'ASP'				),
									(		'AI'				),
									(		'C++'				);

-- creat table 8 Question
CREATE TABLE IF NOT EXISTS Question (
    Question_ID      INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content          TEXT NOT NULL ,
    Category_ID      INT UNSIGNED NOT NULL,
    Type_ID          INT UNSIGNED NOT NULL,
    Creator_ID       INT UNSIGNED NOT NULL,
    Create_Date      DATETIME DEFAULT NOW(),
    FOREIGN KEY (Category_ID) REFERENCES Category_Question (Category_ID),
    FOREIGN KEY (Type_ID) REFERENCES Type_Question (Type_ID),
    FOREIGN KEY (Creator_ID) REFERENCES `Account` (Account_ID)
);

INSERT INTO Question 		(	Content					, 	Category_ID	,	Type_ID		,	Creator_ID		,	Create_Date				)
VALUE						(	'Câu hỏi về HTML'		, 		1		,		1		,		1			,	'2019-03-05'			),
							(	'Câu đố  về JavaScript'	, 		2		,		1		,		1			,	'2018-05-07'			),
                            (	'Câu hỏi về CSS'		, 		3		,		2		,		2			,	'2017-07-09'			),
                            (	'Câu đố  về PHP'		, 		4		,		2		,		3			,	'2016-09-11'			),
                            (	'Câu hỏi về Python'		, 		5		,		1		,		4			,	'2020-11-13'			),
                            (	'Câu đố  về React'		, 		10		,		1		,		10			,	'2011-12-15'			),
                            (	'Câu hỏi về SQL'		, 		9		,		2		,		9			,	'2013-10-17'			),
                            (	'Câu đố  về ASP'		, 		8		,		2		,		8			,	'2015-08-19'			),
                            (	'Câu hỏi về AI'			, 		7		,		1		,		7			,	'2014-06-21'			),
                            (	'Câu đố  về C++'		, 		6		,		2		,		6			,	'2012-04-23'			);

-- creat table 9 Answer
CREATE TABLE IF NOT EXISTS Answer (
    Answer_ID        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content          NVARCHAR(255) NOT NULL,
    Question_ID      INT UNSIGNED NOT NULL,
    is_Correct       ENUM('TRUE', 'FALSE'),
    FOREIGN KEY (Question_ID) REFERENCES Question (Question_ID)
);

INSERT INTO Answer 			(	Content			, 	Question_ID			,	is_Correct				)
VALUE						(	N'Trả lời 01'	, 		1				,		'FALSE'				),
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
    Exam_ID          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`           CHAR(10) NOT NULL,
    Title            NVARCHAR(255) NOT NULL,
    Category_ID      INT UNSIGNED NOT NULL,
    Duration         INT UNSIGNED NOT NULL,
    Creator_ID       INT UNSIGNED NOT NULL,
    Create_Date      DATETIME DEFAULT NOW(),
    FOREIGN KEY (Category_ID) REFERENCES Category_Question (Category_ID),
    FOREIGN KEY (Creator_ID) REFERENCES `Account` (Account_ID)
);

INSERT INTO Exam	 		(	`Code` 		, Title					,	Category_ID		,  Duration	,	Creator_ID		,	Create_Date		)
VALUE						(	'VTI001'	,N'Đề thi HTML'			, 		1			,	60		,		1			,	'2019-12-05'	),
							(	'VTI002'	,N'Đề thi JavaScript'	, 		2			,	90		,		1			,	'2018-11-07'	),
                            (	'VTI003'	,N'Đề thi CSS'			, 		3			,	120		,		2			,	'2017-10-09'	),
                            (	'VTI004'	,N'Đề thi PHP'			, 		4			,	60		,		3			,	'2016-09-11'	),
                            (	'VTI005'	,N'Đề thi Python'		,		5			,	90		,		4			,	'2020-08-13'	),
                            (	'VTI006'	,N'Đề thi React'		, 		10			,	120		,		10			,	'2011-07-15'	),
                            (	'VTI007'	,N'Đề thi SQL'			, 		9			,	60		,		9			,	'2013-01-17'	),
                            (	'VTI008'	,'Đề thi ASP'			, 		8			,	90		,		8			,	'2015-02-19'	),
                            (	'VTI009'	,N'Đề thi AI'			, 		7			,	120		,		7			,	'2014-03-21'	),
                            (	'VTI010'	,N'Đề thi C++'			, 		6			,	60		,		6			,	'2012-04-23'	);

-- creat table 11 Exam Question
CREATE TABLE IF NOT EXISTS Exam_Question (
    Exam_ID           INT UNSIGNED NOT NULL,
    Question_ID       INT UNSIGNED NOT NULL,
    PRIMARY KEY (Exam_ID,Question_ID),
    FOREIGN KEY (Exam_ID) REFERENCES Exam (Exam_ID),
    FOREIGN KEY (Question_ID) REFERENCES Question (Question_ID)
);

INSERT INTO Exam_Question 		(	Exam_ID 		, 	Question_ID		)
VALUE							(		1			, 	  10			),
								(		2			, 	  9				),
                                (		3			, 	  8				),
                                (		4			, 	  7				),
                                (		5			, 	  6				),
                                (		6			, 	  1				),
                                (		7			, 	  2				),
                                (		8			, 	  3				),
                                (		9			, 	  4				),
                                (		10			, 	  5				);
                                