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

	/*Exercise 3 (Optional): File
Tạo class FileManager ở package utils, sau đó tất cả các Question trong Exercise này
sẽ viết vào trong class FileManager, với mỗi Question sẽ viết demo ở front-end
Chú ý: tất cả các error message nên để là constant (static final String)
Question 1: Check File is exists
Tạo 1 method có đầu vào là String path để check xem path đó có tồn
tại hay không.
VD: path = "C:\Users\pc\Desktop\Test.txt"
Gợi ý: Tạo method boolean isFileExists(String pathFile)
Question 2: Create new file
Tạo 1 method để có thể tạo được file.
Chú ý:
Kiểm tra xem file đã tồn tại hay chưa, nếu file đã tồn tại thì sẽ
throw ra Exception "Error! File Exist."
Gợi ý:
Tạo method void createNewFile(String pathFile)
Vào tạo thêm method void createNewFile(String path, String
fileName)
Question 4: Delete file
Tạo 1 method để có thể delete file
Chú ý:
Kiểm tra xem file đã tồn tại hay chưa, nếu file chưa tồn tại thì
sẽ throw ra Exception "Error! File Not Exist."
Gợi ý: Tạo method void deleteFile(String pathFile)
Question 5: Check path is File or Folder
Tạo 1 method để kiểm tra xem path có thể là File hay Folder.
Gợi ý: Tạo method boolean isFolder(String path)
Question 6: Get all File name of Folder
Tạo 1 method để lấy ra tất cả các tên file trong 1 Folder.
Chú ý:
Kiểm tra xem path nhập vào có phải là folder hay không, nếu
không phải thì sẽ throw ra Exception "Error! Path is not
folder."
Gợi ý: Tạo method List<String> getAllFileName(String path)
Question 7: Copy File
Tạo 1 method để copy file.
Chú ý:
Nếu file không tồn tại thì sẽ throw ra Exception "Error! Source
File Not Exist."
Nếu file đích đã tồn tại thì sẽ throw ra Exception "Error!
newPath has File same name."
Gợi ý:
Tạo method void copyFile(String sourceFile, String
distinationPath, String newName)
Và tạo method void copyFile(String sourceFile, String
newPath). Với File mới sẽ có tên cùng với file cũ
Question 8: Moving file
Tạo 1 method để di chuyển file sang folder khác.
Chú ý:
Nếu file không tồn tại thì sẽ throw ra Exception "Error! File
Not Exist.".
Phải xóa file cũ đi
Gợi ý:
Tạo method void moveFile(String sourceFile, String
destinationPath)
Question 9: Rename File
Tạo 1 method để đổi tên file.
Chú ý:
Nếu file không tồn tại thì sẽ throw ra Exception "Error! File
Not Exist.".
Nếu newName đã tồn tại thì sẽ throw ra Exception "Error!
Name is Exist.".
Gợi ý:
Tạo method void renameFile(String pathFile, String
newName)
Question 10: Create new folder
Tạo 1 method để có thể tạo được folder.
Chú ý:
Kiểm tra xem folder đã tồn tại hay chưa, nếu folder đã tồn tại
thì sẽ throw ra Exception "Error! Folder Exist."
Gợi ý: Tạo method void createNewFolder(String newPathFolder)
Question 11: Download File
Hãy viết 1 method để có thể download được file ở trên mạng
Chú ý:
Nếu folder không tồn tại thì sẽ tạo folder.
Nếu tên file download đã tồn tại trong folder thì sẽ thêm (1), (2)
vào sau tên file (giống download file ở window).
Gợi ý:
Tạo method void downloadFile(String fileLink, String
folder)*/
	
public static void main(String[] args) {
		
	
}

}
