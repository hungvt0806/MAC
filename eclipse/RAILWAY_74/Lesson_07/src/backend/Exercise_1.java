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
	
	/*Question 1: static variable
Khai báo 1 class student có các thuộc tính id, name, college
Với college là static variable.
Hãy khởi tạo các student sau:
Student có id = 1, name ="Nguyễn Văn A"
Student có id = 2, name = " Nguyễn Văn B "
Student có id = 3, name = " Nguyễn Văn C "
Và tất cả các student này đều học ở "Đại học bách khoa".
Dùng vòng for để in ra thông tin các student
Sau đó hãy chuyển các student này sang "Đại học công nghệ"
Dùng vòng for để in ra thông tin các student
Question 2: tiếp tục question 1
Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ
lớp - dùng chung cho tất cả các student).
Hãy viết chương trình main() để mô tả các bước sau:
B1: Các Student sẽ nộp quỹ, mỗi Student 100k
B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
B3: Student thứ 2 lấy 20k đi mua bánh mì
B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
In ra số tiền còn của nhóm tại mỗi bước
Question 3: static method
a) Viết class MyMath để thay thế cho class Math của java.
b) Viết thêm method min(), sum vào class MyMath
Question 4: tiếp tục Question 1
Trong class Student
a) Viết method cho phép thay đổi college
b) Viết method cho phép lấy giá trị của college

Question 5:
Hãy viết chương trình đếm số Student được sinh ra (tham khảo code
trên google)
Question 6: tiếp tục Question 5
Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình
đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được
sinh ra.
Viết chương trình demo.
Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4
SecondaryStudent, sau đó in ra số lượng Student,
PrimaryStudent, SecondaryStudent được sinh ra.

Question 7: tiếp tục Question 6
Chỉ cho phép user tạo được tối đa 7 học sinh
Question 8:
Tạo class Configs có các static property
SO_LUONG_HINH_TOI_DA = 5;
Tạo class HinhHoc, và class HinhTron, HinhChuNhat sẽ kế thừa từ
class HinhHoc, implement method tính chu vi, diện tính
Viết chương trình chỉ cho phép khởi tạo được tối đa 5 hình, nếu người
dùng khởi tạo tới hình thứ 6 thì sẽ throw ra 1 custom Exception có tên
là HinhHocException có message là: "Số lượng hình tối đa là: " +
Configs. SO_LUONG_HINH_TOI_DA
Question 9:
Thay đổi các method ở class ScannerUtils ở Assignment 6 thành static
để tiện dùng hơn*/
	
	public static void main(String[] args) {
		

						
					
					
							
		
	}
	
}
