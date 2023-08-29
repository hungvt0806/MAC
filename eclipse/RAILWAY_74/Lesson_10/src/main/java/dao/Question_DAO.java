package dao;

import java.util.ArrayList;

import entity.Question;

public class Question_DAO implements DAOInterface<Question>{
	
	public static Question_DAO getInstance () {
		return  new Question_DAO();
	}

	@Override
	public int insert(Question t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Question t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Question t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Question> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question selectById(Question t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Question> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
