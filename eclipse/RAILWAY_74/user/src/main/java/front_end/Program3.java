package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import backend.userDAO;





public class Program3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
 		// Question 3
			

 			userDAO.getInstance().selectByManager();
 			
 			
 
	
	}
}
