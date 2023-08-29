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
	public static GroupAccount 		gAcc1 			= new GroupAccount(group2,1,LocalDate.of(2018, 7, 9));
	public static GroupAccount 		gAcc2 			= new GroupAccount(group3,1,LocalDate.of(2016, 5, 10));
	public static GroupAccount 		gAcc3 			= new GroupAccount(group1,1,LocalDate.of(2017, 10, 7));
	
	public static GroupAccount []  arrGroupAcc		= {gAcc1,gAcc2,gAcc3};
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
Kiểm tra account thứ 2
Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
"Nhân viên này chưa có phòng ban"
Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."*/
	
//	public static void checkDepartment () {
//		if ( account2.department == null) 
//			System.out.println("Nhân viên này chưa có phòng ban");
//		if ( account2.department != null) 
//			System.out.println("Phòng ban của nhân viên này là : "+ account2.department);
//	
//	}
	
	/*Question 2:
Kiểm tra account thứ 2
Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
này là Java Fresher, C# Fresher"
Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
quan trọng, tham gia nhiều group"
Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
người hóng chuyện, tham gia tất cả các group"*/
	

	
//	public static void checkGroup () {
//		int count = 0;
//		for (GroupAccount ga : arrGroupAcc) {
//			if (account1.accountId == ga.accountId) count++;
//		}
//		
//		if (count == 0)
//			System.out.println("Nhân viên này chưa có group");
//			
//		else if ( count == 1 ) {
//			for (GroupAccount ga : arrGroupAcc) {
//				if (account1.accountId == ga.accountId)
//			System.out.println("Group của nhân viên này là "+ ga.groupId.name);
//			}
//		}
//		
//		else if ( count == 2 ) {
//			System.out.print("Group của nhân viên này là :");
//			for (GroupAccount ga : arrGroupAcc) {
//				if (account1.accountId == ga.accountId)
//			System.out.print( ga.groupId.name+"  ");
//			}
//			}
//		else if ( count == 3 )
//			System.out.println("Nhân viên này là người quan trọng");
//		
//		else if ( count == 4 )
//			System.out.println("Nhân viên là người hóng chuyện ");
//		
//		
//		}
	
	
	/*Question 3:
Sử dụng toán tử ternary để làm Question 1*/
	
	public static void checkDepartment () {
		if ( account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else System.out.println("Phòng ban của nhân viên này là : "+ account2.department);
	
	}

	/*Question 4:
Sử dụng toán tử ternary để làm yêu cầu sau:
Kiểm tra Position của account thứ 1
Nếu Position = Dev thì in ra text "Đây là Developer"
Nếu không phải thì in ra text "Người này không phải là Developer"*/

//	public static void checkPosition () {
//		if ( account2.position == Position.Dev) {
//			System.out.println("Đây là Developer");
//		}else System.out.println("Người này không phải là Developer");
//	
//	}

	/*Question 5:
Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
Còn lại in ra "Nhóm có nhiều thành viên"*/

	public static void checkAccount () {
		int count = 0;
		for (GroupAccount ga : arrGroupAcc) {
			if (ga.groupId == group1) count++;
		}
	if (count == 1) 
		System.out.println("Nhóm có một thành viên");
	 else if (count == 2) 
		 System.out.println("Nhóm có hai thành viên");
	 else if (count == 3)
		 System.out.println("Nhóm có ba thành viên");
	 else System.out.println("Nhóm có nhiều thành viên");
	}
	

	/*Question 6:
Sử dụng switch case để làm lại Question 2*/

	public static void checkGroup () {
		int count = 0;
		for (GroupAccount ga : arrGroupAcc) {
			if (account1.accountId == ga.accountId) count++;
		}
		
		switch (count ) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:{
			for (GroupAccount ga : arrGroupAcc) {
				if (account1.accountId == ga.accountId)
			System.out.println("Group của nhân viên này là "+ ga.groupId.name);
			}
		}
			break;
		case 2:{
			System.out.print("Group của nhân viên này là :");
			for (GroupAccount ga : arrGroupAcc) {
				if (account1.accountId == ga.accountId)
			System.out.print( ga.groupId.name+"  ");
			}
			}
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng");
			break;
		case 4:
			System.out.println("Nhân viên là người hóng chuyện ");
			break;
		
		}
	}

	/*Question 7:
Sử dụng switch case để làm lại Question 4*/
	
	public static void checkPosition () {
		switch ( account2.position ) {
		case Dev:
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
		}
	
	}


	/*Question 8:
In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
họ*/
	
	public static void printAccount() {
		
		
	}
		
	
	/*Question 9:
In ra thông tin các phòng ban bao gồm: id và name*/

	/*Question 10:
In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
họ theo định dạng như sau:
Thông tin account thứ 1 là:
Email: NguyenVanA@gmail.com
Full name: Nguyễn Văn A
Phòng ban: Sale
Thông tin account thứ 2 là:
Email: NguyenVanB@gmail.com
Full name: Nguyễn Văn B
Phòng ban: Marketting*/

	/*Question 11:
In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
Thông tin department thứ 1 là:
Id: 1
Name: Sale
Thông tin department thứ 2 là:
Id: 2
Name: Marketing*/

	/*Question 12:
Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10*/

	/*Question 13:
In ra thông tin tất cả các account ngoại trừ account thứ 2*/

	/*Question 14:
In ra thông tin tất cả các account có id < 4*/

	/*Question 15:
In ra các số chẵn nhỏ hơn hoặc bằng 20*/

	/*Question 16:
Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
lệnh break, continue*/

	/*Question 17:
Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
lệnh break, continue*/
	
	public static void main(String[] args) {
		
//		checkDepartment ();
//		checkGroup ()	;	
		checkAccount ();
					
							
		
	}
	
}
