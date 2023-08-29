package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.Department_DAO;
import entity.Department;

public class Program3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		
	
	
		// Question 7
		
	System.out.print("Nhập vào department id : ");
	Scanner scanner = new Scanner(System.in);
	int id = scanner.nextInt();

	Department dp1 = new Department(id);
	Department_DAO.getInstance().deleteUsingProcedure(dp1);
		
		scanner.close();
	}
}
