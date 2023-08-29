package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DAOInterface <T> {

	public int insert (T t) throws FileNotFoundException, IOException;
	
	public int update (T t)throws FileNotFoundException, IOException,SQLException;
	
	public int delete (T t) throws FileNotFoundException, IOException,SQLException;
	
	public List<T> selectAll() throws FileNotFoundException, IOException,SQLException;
	
	public T selectById(T t)throws FileNotFoundException, IOException,SQLException;
	
	public boolean isSelectByName(T t)throws FileNotFoundException, IOException,SQLException;
	
	public boolean isSelectById(T t)throws FileNotFoundException, IOException,SQLException;
	
	public ArrayList<T> selectByCondition(String codition);

	public  void joinTable()throws FileNotFoundException, IOException;
	
	public int  deleteUsingProcedure (T t) throws FileNotFoundException, IOException,SQLException;



	


	
}
