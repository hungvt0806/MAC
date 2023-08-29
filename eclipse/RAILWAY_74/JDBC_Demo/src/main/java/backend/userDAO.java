package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.user;

public class userDAO implements DAOInterface<user> {
	public static userDAO getInstance() {
		return new userDAO();
	}

	public void selectByProjectId(user t) throws FileNotFoundException, IOException, SQLException {
		List<user> user = new ArrayList<>();
		int check = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM `User` WHERE project_id = ? AND `role` = 'employee';";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, t.getProject_id());
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				int projectId = rs.getInt("project_id");
				String name = rs.getString("fullname");
				user user1 = new user(name, projectId);
				user.add(user1);
				check++; 
			}	
			
			if (check !=0) {
				for ( user user1: user) 
				System.out.println(user1.toString());
			}else
				System.out.println("Cannot find employee which has project id = " + t.getProject_id());
		

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw  new SQLException(" Cannot find project id = " + t.getProject_id());
		}

		return;
		
	}

	public void selectByManager() throws FileNotFoundException, IOException, SQLException {
		List<user> user = new ArrayList<entity.user>();
		int check = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM `User` WHERE `role` = 'manager';";

			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				int projectId = rs.getInt("project_id");
				String name = rs.getString("fullname");
				String role = rs.getString("role");
				user user1 = new user(name, projectId,role);
				user.add(user1);
				check++; 
			}	
			
			if (check !=0) {
				for ( user user1: user) 
				System.out.println(user1.toString());
			}else
				System.out.println("Cannot find any manager " );
			

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw  new SQLException(" Cannot find any project id = " );
		}

		return;
		
	}

	public boolean isSelectEmail(user t) throws FileNotFoundException, IOException, SQLException {
		boolean check = false;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM `User` WHERE email = ? AND `role` = 'manager';";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getEmail());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) 
				check = true;
			

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw  new SQLException(" Cannot found email " );
		}

		return check;
	}

	public boolean isSelectPassword(user t) throws FileNotFoundException, IOException, SQLException {
		boolean check = false;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM `User` WHERE `password` = ? AND `role` = 'manager';";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) 
				check = true;

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw  new SQLException(" Wrong password " );
		}

		return check;
	
	}

	

}
