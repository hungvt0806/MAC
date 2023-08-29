package backend;

import java.time.LocalDate;

import entity.Account;
import entity.Answer;
import entity.CategoryQuestion;
import entity.Department;
import entity.Exam;
import entity.ExamQuestion;
import entity.Group;
import entity.GroupAccount;
import entity.Position;
import entity.Question;
import entity.TypeQuestion;

public class Exercise_1 {
	
	// creat department	
	public static Department 		department1 	= new Department(1,"Sale");
	public static Department 		department2 	= new Department(2,"Marketting");
	public static Department 		department3 	= new Department(3,"HR");
	
	// create group
	public static Group 	 		group1  	 	= new Group(1,"starbuck",3,LocalDate.now());
	public static Group 	 		group2  	 	= new Group(2,"docomo",2,LocalDate.of(2018, 7, 3));
	public static Group 			group3  	 	= new Group(3,"softbank",1,LocalDate.of(2017, 9, 9));
	
	public static Group [] groupOfAccount1 			= {group1,group3} ;
	public static Group [] groupOfAccount2 			= {group1,group2,group3} ;
	public static Group [] groupOfAccount3 			= {group1,group2} ;
	
	// creat account
	public static Account 	 		account1 	 	= new Account 
			(1,"puppy＠gmail.com","puppy","Lã Bất Vi",department3,
					Position.Dev,LocalDate.of(2019 , 3 , 5),groupOfAccount2) ;
	public static Account 	 		account2 	 	= new Account 
			(2,"kitten＠gmail.com","kitten","Lưu Bang",department1,
					Position.PM,LocalDate.of(2018 , 2 , 7),groupOfAccount3) ;
	public static Account 	 		account3 	 	= new Account 
			(4,"hamster＠gmail.com","puppy","Lã Bất Vi",department2,
					Position.Scrum_Master,LocalDate.of(2017 , 9 , 9),groupOfAccount1) ;
	
	// create group account
	public static GroupAccount 		gAcc1 			= new GroupAccount(2,account3,LocalDate.of(2018, 7, 9));
	public static GroupAccount 		gAcc2 			= new GroupAccount(3,account2,LocalDate.of(2016, 5, 10));
	public static GroupAccount 		gAcc3 			= new GroupAccount(1,account1,LocalDate.of(2017, 10, 7));
	
	// create category question
	public static CategoryQuestion catQ1 			= new CategoryQuestion(1,"HTML");
	public static CategoryQuestion catQ2 			= new CategoryQuestion(3,"JavaScript");
	public static CategoryQuestion catQ3 			= new CategoryQuestion(2,"CSS");
	
	// create question
	public static Question 			qt1 			=new Question
			(1,"Câu hỏi về HTML",catQ1,TypeQuestion.Essay,3,LocalDate.of(2016, 10, 5));
	public static Question 			qt2 			=new Question
			(2,"Câu đố  về JavaScript",catQ3,TypeQuestion.Multiple_Choice,8,LocalDate.of(2010, 11, 8));
	public static Question 			qt3 			=new Question
			(3,"Câu hỏi về CSS",catQ2,TypeQuestion.Essay,9,LocalDate.of(2015, 12, 17));
	
	// create answer
	public static Answer 			asr1 			= new Answer(6,"Trả lời 01",qt1,true);
	public static Answer 			asr2 			= new Answer(8,"Trả lời 03",qt3,true);
	public static Answer 			asr3 			= new Answer(9,"Trả lời 02",qt2,false);
	
	// create exam
	public static Exam 				ex1 			= new Exam
			(1,"VTI001","Đề thi HTML",catQ1,60,3,LocalDate.of(2019, 8, 4));
	public static Exam 				ex2 			= new Exam
			(6,"VTI002","Đề thi JavaScript",catQ2,30,6,LocalDate.of(2018, 11, 8));
	public static Exam 				ex3 			= new Exam
			(4,"VTI004","Đề thi CSS",catQ3,90,2,LocalDate.of(2016, 1, 6));
	
	// create exam question
	public static ExamQuestion 		exQ1 			= new ExamQuestion(7,qt1);
	public static ExamQuestion 		exQ2 			= new ExamQuestion(8,qt3);
	public static ExamQuestion 		exQ3 			= new ExamQuestion(9,qt2);
	
	/*Exercise 1: Collection
Question 1: List
Tạo 1 student có property id, name (trong đó có 3 student có name
trùng nhau, id sẽ là auto increment)
Khai báo 1 ArrayList students, sau đó
a) In ra tổng số phần tử của students
b) Lấy phần tử thứ 4 của students
c) In ra phần tử đầu và phần tử cuối của students
d) Thêm 1 phần tử vào vị trí đầu của students
e) Thêm 1 phần tử vào vị trí cuối của students
f) Đảo ngược vị trí của students
g) Tạo 1 method tìm kiếm student theo id
h) Tạo 1 method tìm kiếm student theo name
i) Tạo 1 method để in ra các student có trùng tên
j) Xóa name của student có id = 2;
k) Delete student có id = 5;
l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
studentCopies

Question 2 (Optional): Stack & Queue
Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ
tự tới của các học sinh như sau:
Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam,
Nguyễn Văn A
a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
muộn nhất tới sớm nhất (gợi ý dùng Stack)
b) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
sớm nhất tới muộn nhất (gợi ý dùng Queue)
Question 3 (Optional): Set
Tạo 1 student có property id, name
Khai báo 1 Set students, sau đó làm các chức năng tương tự List
Question 4 (Optional): Set
Tạo 1 danh sách có chứa name của các student không trùng nhau
In ra set đó
Question 5 (Optional): Set
Tạo 1 danh sách có chứa name của các student không trùng nhau.
Sắp xếp theo name và in ra set đó
Question 6: Map
Để thay thế 1 object ta có thể tạo 1 map tên là students có key = id của
student , value là name của students
Question 7 (Optional): tiếp tục question 6
Thực hiện các chức năng sau:
a) In ra các key của students
b) In ra value của students
c) In ra danh sách students được sắp xếp theo tên của student
d) Chuyển đổi map students sang set*/
	
	public static void main(String[] args) {
		
		
	
				
				
					
					
					
							
		
	}
	
}
