package testingSystem_Assignment_4;

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

	/*Chú ý: áp dụng cả encapsulation cho các question ở dưới
Question 1: inheritance
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
khác), địa chỉ.
Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
Các nhân viên có thuộc tính riêng: công việc.
Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp
CanBo.
Question 2: Tiếp tục Question 1
Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
hiện các chức năng sau:
a) Thêm mới cán bộ.
b) Tìm kiếm theo họ tên.
c) Hiện thị thông tin về danh sách các cán bộ.
d) Nhập vào tên của cán bộ và delete cán bộ đó
e) Thoát khỏi chương trình.
Question 3 (Optional): constructor inheritance
Tạo class abstract Person gồm các property name và tạo constructor có
1 parameter name
Tạo class abstract Student kế thừa Person gồm các property id, name
và tạo constructor có 2 parameter id, name
Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
muốn vào) và tạo constructor có 4 parameter id, name, clazz,
desiredUniversity.
Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
"Nam", clazz = "Chuyên Văn", desiredUniversity = "Đại học công
nghệ"
Question 4 (Optional):
Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi
tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất),
Tên nhà xuất bản, số bản phát hành.
Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
Các báo cần quản lý thêm: Ngày phát hành.
Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
cách hiệu quả.
Xây dựng lớp QuanLySach có các chức năng sau
a) Thêm mới tài liêu: Sách, tạp chí, báo.
b) Xoá tài liệu theo mã tài liệu.
c) Hiện thị thông tin về tài liệu.
d) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
e) Thoát khỏi chương trình.*/
	
	
public static void main(String[] args) {
		
		
				
}

}
