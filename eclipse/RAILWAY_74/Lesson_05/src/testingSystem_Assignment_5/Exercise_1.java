package testingSystem_Assignment_5;

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
	
	/*Question 1: Interface
Tạo một interface có tên INews bao gồm method void Display(), float
Calculate().
Tạo một class News bao gồm thuộc tính:
ID (int), Title (String), PublishDate (String), Author (String),
Content (String) và AverageRate (float).
Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ
có getter.
Implement các method trong interface INews như sau:
a) Method Display() sẽ in ra Title, PublishDate, Author,
Content và AverageRate của tin tức ra console.
b) Method có tên Calculate() để thiết đặt thuộc tính
Khai báo một array có tên Rates kiểu int gồm 3 phần tử
AverageRate là trung bình cộng của 3 phần tử của array
Rates.
c) Tạo chương trình demo có tên là MyNews và tạo một menu
lựa chọn gồm các mục sau:
 Insert news
 View list news
 Average rate
 Exit
Nếu người dùng chọn 1 từ bàn phím thì tạo một object của
class News và nhập giá trị cho các thuộc tính Title,
PublishDate, Author, Content sau đó yêu cầu người dùng
nhập vào 3 đánh giá để lưu vào Rates.
Nếu người dùng chọn 2 từ bàn phím thì thực thi method
Display().
Nếu người dùng chọn 3 từ bàn phím thì thực hiện method
Calculate() để tính đánh giá trung bình, sau đó thực thi
method Display().
Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình
Question 2 (Optional):
Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối
C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa
chỉ, mức ưu tiên.
Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
b) Xây dựng interface ITuyenSinh và class TuyenSinh có các
chức năng:
a. Thêm mới thí sinh.
b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
c. Tìm kiếm theo số báo danh.
d. Thoát khỏi chương trình.*/
	
	public static void main(String[] args) {
		
		
	
				
				
					
					
					
							
		
	}
	
}
