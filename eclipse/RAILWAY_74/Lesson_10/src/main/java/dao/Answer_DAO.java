package dao;

import java.util.ArrayList;

import entity.Answer;

public class Answer_DAO implements DAOInterface<Answer> {
	
	public static Answer_DAO getInstance () {
		return  new Answer_DAO();
	}

	@Override
	public int insert(Answer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Answer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Answer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Answer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Answer selectById(Answer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Answer> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
