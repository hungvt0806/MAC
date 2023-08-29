package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import dao.Account_DAO;
import dao.Department_DAO;
import dao.JDBCUtil;
import entity.Account;
import entity.Department;
import entity.Position;



public class Program1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		//Question 1
//		Connection connection = JDBCUtil.getConnection();
//		System.out.println(connection);
				
		//Question 2
//		Account_DAO.getInstance().joinTable();
		
		//Question 3
		
		Department department1 = new Department(6);
		Position position1 = new Position(1);
		Account acc1 = new Account(	"puppy＠gmail.vn" , "happy","Lã Trĩ"	,department1,position1,LocalDate.of(2023, 7, 25)); 
		Account_DAO.getInstance().insert(acc1);
		
//		Department dp1 = new Department(17, "Boja");
//		Department_DAO.getInstance().insert(dp1);
		
		
		
//		String positionToAdd = "Boja";
//		Position_DAO.getInstance().insert();
		
	}

}
