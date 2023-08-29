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

public class Exercise_3 {
	
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

	/*Exercise 3: Generic
Question 1: T generic (class)
Tạo class student có property id, name (trong đó id của student có thể
là int, long, float)
a) Tạo đối tượng student có id là int
b) Tạo đối tượng student có id là float
c) Tạo đối tượng student có id là double

Question 2: T generic (method)
Tạo method để in ra thông tin nhập vào (parameter)
(parameter có thể là họ và tên, hoặc student, hoặc int)
Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
Demo chương trình với print(student), print(4), print(4.0)
Question 4: E generic
Tạo 1 array int, 1 array float, 1 array long, 1 array double
Tạo 1 method có parameter là array và in ra các số trong array đó
Question 5: E generic
Tạo 1 class Employee có property id, name, salaries với salaries là
lương các tháng của Employee đó và là 1 array có data type có thể là
int, long, float.
Viết method trong Employee để in ra thông tin của Employee bao gồm
id, name, salaris.
Viết method trong Employee để in ra thông tin tháng lương cuối cùng
của Employee
a) Hãy tạo chương trình demo với Employee có salaries là
datatype int
b) Hãy tạo chương trình demo với Employee có salaries là
datatype float
c) Hãy tạo chương trình demo với Employee có salaries là
datatype double
Question 6: K & V generic
Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
Tạo các method
a) GetValue()
b) getKey ()
Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên
và value là tên của sinh viên đó
Question 7: K & V generic
Tạo 1 class có tên là Phone, lưu dữ liệu theo dạng key, value (extends
MyMap)
Với key là email hoặc là số thứ tự hoặc là tên người sử dụng
Với value là số điện thoại
Tạo các method
a) GetPhoneNumber()
b) getKey ()
Viết chương trình demo với
a) key là email
b) key là số thứ tự
c) key là tên của người sử dụng

Question 8: K & V generic
Tạo 1 class có tên là Staff, lưu dữ liệu theo dạng key, value (extends
MyMap)
Với key là id của Staff (ID có thể là int, long)
Với value là tên của Staff
Tạo các method
a) GetId ()
b) getName ()
Viết chương trình demo
*/
	
public static void main(String[] args) {
		
		
}

}
