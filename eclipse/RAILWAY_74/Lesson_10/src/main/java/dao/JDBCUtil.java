package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() throws FileNotFoundException, IOException {
		Connection c = null;
		
		
		try {
			// đăng kí MySQL Diver với Driver Manager
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/main/resource/database.properties"));
			
			
			// cac thong so
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			// tao ket noi
			c = DriverManager.getConnection(url, username, password);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	

		
		
	
	}
	
	

	public static void closeConnection ( Connection c) {
		
	try {
		
		if (c!=null) 
			c.close();
				
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
		
	}
}
