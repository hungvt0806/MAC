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

public class Exercise_2 {
	
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

	/*Question 1: Interface Management
Tạo 1 class Student gồm các property id, name, group(int)
Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(),
đi dọn vệ sinh()
Class Student sẽ implement interface như sau:
Method điểm danh() sẽ in ra nội dung như sau:
"Nguyễn Văn A điểm danh"
"Nguyễn Văn B điểm danh"
"Nguyễn Văn C điểm danh"
....
Method học Bài () sẽ in ra nội dung như sau:
"Nguyễn Văn A đang học bài"
"Nguyễn Văn B đang học bài "
"Nguyễn Văn C đang học bài "
...
Tương tự với các method còn lại
Hãy viết chương trình thực hiện các lệnh sau:
a) Tạo 10 học sinh, chia thành 3 nhóm
b) Kêu gọi cả lớp điểm danh.
c) Gọi nhóm 1 đi học bài
d) Gọi nhóm 2 đi dọn vệ sinh
Question 2 (Optional): Abstract Management
Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa
chỉ với đầy đủ getter setter, constructor không tham số, constructor đầy
đủ tham số
a) Viết phương thức inputInfo(), nhập thông tin Person từ bàn
phím
b) Viết phương thức showInfo(), hiển thị tất cả thông tin Person
Tạo class Student thừa kế Person, lưu trữ các thông tin một sinh viên:
Mã sinh viên, Điểm trung bình, Email
a) Override phương thức inputInfo(), nhập thông tin Student từ
bàn phím
b) Override phương thức showInfo(), hiển thị tất cả thông tin
Student
c) Viết phương thức xét xem Student có được học bổng không?
Điểm trung bình từ 8.0 trở lên là được học bổng

Question 3: This & Super, Overriding
Tạo 1 class HinhChuNhat có 2 method: tính chu vi và tính diện tích.
Hãy implement 2 method này.
Tiếp theo hãy tạo 1 class HinhVuong extends HinhChuNhat, có 2
method tính chu vi và tính diện tích
Chú ý:
Không implement method trong class HinhVuong theo công
thức tính diện tích, chu vi hình vuông mà sẽ gọi theo
HinhChuNhat.tinhChuVi(), HinhChuNhat.tinhDienTich() )
Và trong mỗi method print thêm dòng "Tính diện tích/ chu vi
theo Hình Vuông/ Hình Chữ Nhật"

Question 4 (Optional):
Tạo 1 class MyMath có method sum có 2 parameter (có thể là int, có
thể là byte, có thể là float), sau đó trả về tổng của 2 số đó. Hãy viết
chương trình demo.

*Question 5 (Optional):
Điện thoại di động được chia thành 2 loại: điện thoại cổ điển và điện
thoại thông minh. Cả 2 loại điện thoại này đều có 4 chức năng cơ bản:
nghe và gọi điện thoại, gửi và nhận tin nhắn văn bản. Riêng điện thoại
thông minh thì có thêm các chức năng: sử dụng 3G, chụp hình. Điện
thoại cổ điển có sẵn chức năng nghe đài radio (điện thoại thông minh
không có sẵn chức năng này). Cả điện thoại cổ điển và điện thoại
thông minh đều có thể sử dụng làm vũ khí
(trong tình huống người dùng cần sử dụng để tấn công kẻ xấu).
Hãy thiết kế các class, interface, method*/
	
public static void main(String[] args) {
		
		
	
									
		
	}
}
