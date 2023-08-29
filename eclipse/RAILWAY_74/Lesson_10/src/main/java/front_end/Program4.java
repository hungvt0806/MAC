package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Program4 {
	public static void main(String[] args) 
			throws ClassNotFoundException, FileNotFoundException, SQLException,IOException{
		Connection connection = getConnection ();
		//turn off auto commit
		connection.setAutoCommit(false);
		
		//Create group
		try {
			
			createGroup(connection);
			createUser(connection);
			addUserToGroup(connection);
			
			// commit transaction
			connection.commit();
			System.out.println("Transaction Commit !");
			
		} catch (Exception e) {
		e.printStackTrace();
		connection.rollback();
		System.out.println("Transaction Rollback !");
		}
		// turn on auto commit
		connection.setAutoCommit(true);
		// step 6 Close connection
		connection.close();
	}

}
