package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;




public interface DAOInterface <T> {


	

	
	public void selectByProjectId(T t) throws FileNotFoundException, IOException, SQLException;
	

	public void selectByManager() throws FileNotFoundException, IOException, SQLException;

	public boolean isSelectEmail(T t) throws FileNotFoundException, IOException, SQLException;

	public boolean isSelectPassword(T t) throws FileNotFoundException, IOException, SQLException;


	
}
