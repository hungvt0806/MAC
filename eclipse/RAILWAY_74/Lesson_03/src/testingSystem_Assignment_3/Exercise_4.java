package testingSystem_Assignment_3;

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

public class Exercise_4 {
	
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
	Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
	thể cách nhau bằng nhiều khoảng trắng );
	Question 2:
	Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
	Question 3:
	Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
	viết hoa chữ cái đầu thì viết hoa lên
	Question 4:
	Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
	của người dùng ra
	VD:
	Người dùng nhập vào "Nam", hệ thống sẽ in ra
	"Ký tự thứ 1 là: N"
	"Ký tự thứ 1 là: A"
	"Ký tự thứ 1 là: M"

	Question 5:
	Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
	dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
	Question 6:
	Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
	sau đó hệ thống sẽ tách ra họ, tên , tên đệm
	VD:
	Người dùng nhập vào "Nguyễn Văn Nam"
	Hệ thống sẽ in ra
	"Họ là: Nguyễn"
	"Tên đệm là: Văn"
	"Tên là: Nam"

	Question 7:
	Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
	chuẩn hóa họ và tên của họ như sau:
	a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
	VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
	chuẩn hóa thành "nguyễn văn nam"
	b) Viết hoa chữ cái mỗi từ của người dùng
	VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
	chuẩn hóa thành "Nguyễn Văn Nam"

	Question 8:
	In ra tất cả các group có chứa chữ "Java"
	Question 9:
	In ra tất cả các group "Java"
	Question 10 (Optional):
	Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
	Nếu có xuất ra “OK” ngược lại “KO”.
	Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
	Question 11 (Optional): Count special Character
	Tìm số lần xuất hiện ký tự "a" trong chuỗi
	Question 12 (Optional): Reverse String
	Đảo ngược chuỗi sử dụng vòng lặp
	Question 13 (Optional): String not contains digit
	Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
	lại true.
	Ví dụ:
	"abc" => true
	"1abc", "abc1", "123", "a1bc", null => false
	Question 14 (Optional): Replace character
	Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
	cho trước.
	Ví dụ:
	"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
	Question 15 (Optional): Revert string by word
	Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
	thư viện.
	Ví dụ: " I am developer " => "developer am I".
	Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
	Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
	chuỗi theo dấu cách
	Question 16 (Optional):
	Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
	bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
	hình “KO”.*/
	
public static void main(String[] args) {
		
		
				
}

}
