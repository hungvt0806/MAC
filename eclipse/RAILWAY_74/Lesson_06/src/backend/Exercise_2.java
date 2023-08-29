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

	/*Question 1: try...catch...finally

Hãy xử lý exception cho VD trên, khi bị lỗi thì sẽ in ra text "cannot
divide 0"
Question 2: tiếp tục Question 1
Sau khi thực hiện xong method divide dù có lỗi hay không sẽ in ra text
"divide completed!"
Question 3:

Hãy xử lý exception cho VD trên và in ra thông tin lỗi.
Question 4:
Tạo 1 array departments gồm 3 phần tử
Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
in ra text "Cannot find department."
Question 5:
Tạo 1 method inputAge() và trả về 1 số int.
Trong method hãy cài đặt như sau:
B1: Sau đó dùng scanner để nhập vào 1 số

*B2: Check exeption
Nếu người dùng nhập vào 1 số thì return về số đó
Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
text "wrong inputing! Please input an age as int, input
again."
Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
dòng text "Wrong inputing! The age must be greater
than 0, please input again."
B3: hãy demo trong method main()
Gợi ý:
o Tại bước 1 & bước 2: Check exception, ta có thể yêu cầu người
dùng nhập vào String (scanner.nextLine()),
o Sau đó sử dụng casting datatype để convert String to int
o Nếu convert được thì suy ra người dùng nhập vào 1 số
int
o Nếu không convert được thì suy ra người dùng nhập sai,
khi người dùng nhập sai thì sẽ in ra text "wrong
inputing! Please input an age as int, input again."

Question 6: Tiếp tục Question 5
Sửa lại method inputAge() như sau:
Tại B2 của Question 5, Nếu người dùng không nhập vào 1 số thì sẽ in
ra dòng text "wrong inputing! Please input an age as int, input again.",
đồng thời yêu cầu người dùng nhập lại
Gợi ý: sử dụng while
Question 7: làm tương tự câu 6
Tạo 1 class ScannerUtils, trong class sẽ tạo 1 method inputInt() chuyên
để nhập dữ liệu dạng int như age, id, ...
Gợi ý: inputInt() sẽ có parameter là String errorMessage để người dùng
có thể tự điền được errorMessage vào
Question 8: làm tương tự câu 7
Làm tương tự câu 7 với các method inputFloat(), inputDouble(),
inputString()
Riêng với inputString() thì không cần phải handling exception
Question 9:
Sử dụng ScannerUtils vừa tạo để nhập thông tin cho Department,
Position với điều kiện khi khởi tạo object sẽ yêu cầu nhập vào thông
tin luôn trong constructor (VD như hình dưới)
Question 10: làm giống bài 9
Sử dụng ScannerUtils để nhập thông tin cho Group
Khi tạo các property array accounts thì hỏi người dùng xem, bạn có
muốn thêm accounts hay không, nếu người dùng đồng ý thì sẽ nhập
thông tin account
(với mỗi thông tin Account nhập vào ta sẽ tạo Object mới)
Question 11 (Optional): Custom Exception
Tạo custom Exception tên là: InvalidAgeInputingException.
Hãy viết method inputAge() ở class Account với yêu cầu như sau:
Khi người dùng nhập vào tuổi <= 0 thì throw ra Exception
InvalidAgeInputingException với message là: "The age must
be greater than 0"

Question 12 (Optional): Tiếp tục Question 11
Trong class Account. Sử dụng method inputAge() từ ScannerUtils, hãy
viết method inputAccountAge() với yêu cầu như sau:
Khi hệ thống gặp exception InvalidAgeInputingException thì
sẽ in ra message.
Và khi người dùng nhập vào tuổi < 18 thì in ra text "Your age
must be greater than 18" và yêu cầu người dùng nhập lại tuổi
Sau đó sử dụng method inputAccountAge() để nhập tuổi ở trong
Constructor (sửa lại Constructor ở Question 10)*/
	
public static void main(String[] args) {
		
		
									
		
	}
}
