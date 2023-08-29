									-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Thêm ít nhất 10 record vào mỗi table
-- Question 2: lấy ra tất cả các phòng ban
SELECT 		*
FROM 		Department;

-- Question 3: lấy ra id của phòng ban "Sale"
SELECT 		Department_ID
FROM 		Department
WHERE 		Department_Name = 'Sale';

-- Question 4: lấy ra thông tin account có full name dài nhất
SELECT 		*
FROM 		`Account`
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`);

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
SELECT 		*
FROM 		`Account`
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`) AND Department_ID = 3;

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 		Group_Name	,Create_Date
FROM 		`Group`
WHERE 		Create_Date <'2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời
SELECT 		Question_ID
FROM 		Answer
GROUP BY 	Question_ID
HAVING 		COUNT(Question_ID) >= 4;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT 		`Code`,Duration,Create_Date
FROM 		Exam
WHERE 		Duration >= 60 AND Create_Date <'2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất
SELECT 		*
FROM 		`Group`
ORDER BY 	Create_Date DESC LIMIT 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2
SELECT 		COUNT(Account_ID),Department_ID
FROM 		`Account`
GROUP BY 	Department_ID
HAVING 		Department_ID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT 		Fullname
FROM 		`Account`
WHERE 		Fullname LIKE  'D%o';

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE 
FROM 		Exam
WHERE 		Create_Date <'2019-12-20';
-- SELECT		 *
-- FROM 		Exam;

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE 
FROM 		Question
WHERE 		Content LIKE 'Câu hỏi%';
-- SELECT		 *
-- FROM 		Exam;

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE `Account` 
SET Fullname = N'Nguyễn Bá Lộc', Email ='loc.nguyenba@vti.com.vn'
WHERE Account_ID = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE Group_Account 
SET Account_ID = 5
WHERE Group_ID = 4;