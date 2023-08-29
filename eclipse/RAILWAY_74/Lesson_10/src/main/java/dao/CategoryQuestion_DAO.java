package dao;

import java.util.ArrayList;

import entity.CategoryQuestion;

public class CategoryQuestion_DAO implements DAOInterface<CategoryQuestion> {

	public static CategoryQuestion_DAO getInstance () {
		return  new CategoryQuestion_DAO();
	}
	
	@Override
	public int insert(CategoryQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CategoryQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CategoryQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CategoryQuestion> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryQuestion selectById(CategoryQuestion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CategoryQuestion> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
