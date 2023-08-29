package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dao.JDBCUtil;

public class testJDBCUtil {
	
//	public static void main(String[] args) throws FileNotFoundException, IOException {
//		
//		try {
//		// buoc 1 tao ket noi
//		Connection connection = JDBCUtil.getConnection();
//		System.out.println(connection);
//		
//		// buoc 2 tao ra doi tuong statement
//		Statement st = connection.createStatement();
//		
//		// buoc 3 thuc thi mot cau lenh SQL
//		String sql = "INSERT INTO department 			  (	department_name		)\r\n"
//				+ "VALUE									  (	 N'Ben Tre'			);";
//		int check = st.executeUpdate(sql);
//		// buoc 4 xu ly ket qua
//		System.out.println("So dong thay doi :"+check);
//		if (check >0) 
//			System.out.println("Them du lieu thanh cong !");
//		else 
//			System.out.println("Them du lieu that bai !");
//		
//		
//		// buoc 5 ngat ket noi
//		JDBCUtil.closeConnection(connection);
//	}catch (SQLException e) {
//		e.printStackTrace();
//	}
//	}

}
