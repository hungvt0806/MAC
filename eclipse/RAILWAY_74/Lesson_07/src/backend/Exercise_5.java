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

	
	/*Exercise 5: Demo File & IO Stream
Question 1: Tạo class Student có property id, name.
a) Sau đó khởi 3 instance từ console (sử dụng ScannerUtils)
b) Write 3 student này ra file tên là StudentInformation.txt
c) Sau đó đọc thông tin file StudentInformation.txt và in ra màn hình
Question 2: Tạo LogUtils (sử dụng write Object Exception)
Tạo 1 custom Exception Object, sau đó tại hàm main sẽ bắt exception
ko mong muốn và lưu thông tin Exception.ser file
Các bước làm sẽ như sau:
B1: Tạo 1 object MyException sẽ extends Exception, trong
MyException sẽ chứa các thông tin như: message, reason, StackTrace,
time (thời gian bị Exception), ...
B2: Sau đó tạo class LogUtils có 1 vài method như sau:
1. void writeLog (String message, String reason, StackTrace,
Datetime time) (gợi ý: sử dụng IOManager ở trên để write file)
2. void writeLog (MyException exception)
B3: đặt try catch ở method main() hoặc ở bất kỳ chỗ nào muốn lưu lại
thông tin exception
B4: Tạo method để đọc thông tin trong file Exception và in ra màn
hình
B5: Demo chương trình
Question 3 (Optional):
Thiết kế bài lô đề của exercise trước với những cải tiến về handling
exception, đăt các property static, final cho hợp lý và thêm các chức
năng sau đây:
a) Đăng ký tài khoản (thông tin các tài khoản sẽ lưu vào file)
Có 2 loại tài khoản admin và user.
b) Đăng nhập vào hệ thống
c) Đăng xuất tài khoản
d) Cho phép nạp tiền vào tài khoản (lưu thông tin vào file)
e) Lưu thông tin kết quả lô đề từng ngày vào file
f) Lưu thông tin người dùng chơi lô đề vào file
g) Tạo thêm chức năng sau:
1) Chỉ có admin mới có thể xem thông tin tất cả các tài
khoản (giống table ở SQL khi SELECT * Account, ẩn
mật khẩu đi)
2) Người dùng có thể xem lại thông tin lô đề từng ngày (hệ
thống có hỗ trợ chức năng tìm kiếm theo ngày, và lọc
chỉ xem từ ngày nào tới ngày nào)*/
	
public static void main(String[] args) {
		
		
				
}

}
