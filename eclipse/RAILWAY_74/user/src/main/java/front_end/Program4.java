package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import backend.userDAO;

import entity.user;

public class Program4 {
	public static void main(String[] args) 
			throws ClassNotFoundException, FileNotFoundException, SQLException,IOException{
		
		// Question 4
		
		System.out.print("Nhập vào email : ");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		System.out.print("Nhập vào password : ");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		
		user user1 = new user(email,password);
			
		if (userDAO.getInstance().isSelectEmail(user1)) {
			if (userDAO.getInstance().isSelectPassword(user1)) {
				System.out.println("Login succsess!");
			}
		} else {
				System.out.println(" Login unsuccess! " );
		}
			

								
				
			
			sc.close();
			scanner.close();
		
	}

}
