package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import backend.userDAO;
import entity.user;

public class Program2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {

 			
 		// Question 2
 			
			System.out.print("Nhập vào project id : ");
			Scanner scanner = new Scanner(System.in);
			int projectId = scanner.nextInt();

			user user1 = new user(projectId);
 			userDAO.getInstance().selectByProjectId(user1);
 			
 			
 			scanner.close();
		
		
}
}
