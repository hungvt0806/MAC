package testingSystem_Assignment_2;

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

public class Exercise_5 {
	
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
	public static GroupAccount 		gAcc1 			= new GroupAccount(2,3,LocalDate.of(2018, 7, 9));
	public static GroupAccount 		gAcc2 			= new GroupAccount(3,2,LocalDate.of(2016, 5, 10));
	public static GroupAccount 		gAcc3 			= new GroupAccount(1,1,LocalDate.of(2017, 10, 7));
	
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

	
	/*Question 1:
Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình*/
	
	/*Question 2:
Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình*/
	
	/*Question 3:
Viết lệnh cho phép người dùng nhập họ và tên*/
	
	/*Question 4:
Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ*/
	
	/*Question 5:
Viết lệnh cho phép người dùng tạo account (viết thành method)
Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
chương trình sẽ chuyển thành Position.Dev, Position.Test,
Position.ScrumMaster, Position.PM*/
	
	/*Question 6:
Viết lệnh cho phép người dùng tạo department (viết thành method)*/
	
	/*Question 7:
Nhập số chẵn từ console*/
	
	/*Question 8:
Viết chương trình thực hiện theo flow sau:
Bước 1:
Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
dụng"
Bước 2:
Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
department
Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
lại" và quay trở lại bước 1*/
	
	/*Question 9:
Viết method cho phép người dùng thêm group vào account theo flow sau:
Bước 1:
In ra tên các usernames của user cho người dùng xem
Bước 2:
Yêu cầu người dùng nhập vào username của account
Bước 3:
In ra tên các group cho người dùng xem
Bước 4:
Yêu cầu người dùng nhập vào tên của group
Bước 5:
Dựa vào username và tên của group người dùng vừa chọn, hãy
thêm account vào group đó .*/
	
	/*Question 10: Tiếp tục Question 8 và Question 9
Bổ sung thêm vào bước 2 của Question 8 như sau:
Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
account
Bổ sung thêm Bước 3 của Question 8 như sau:
Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
kết thúc chương trình)*/
	
	/*Question 11: Tiếp tục Question 10
Bổ sung thêm vào bước 2 của Question 8 như sau:
Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
Bước 1:
In ra tên các usernames của user cho người dùng xem
Bước 2:
Yêu cầu người dùng nhập vào username của account
Bước 3:
Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
Bước 4:
Thêm account vào group chương trình vừa chọn ngẫu
nhiên*/
	
public static void main(String[] args) {
		
		
				
}

}
