package dao;

import java.util.ArrayList;

import entity.ExamQuestion;

public class ExamQuestion_DAO implements DAOInterface<ExamQuestion>{
	
	public static ExamQuestion_DAO getInstance () {
		return  new ExamQuestion_DAO();
	}

	@Override
	public int insert(ExamQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ExamQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ExamQuestion t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ExamQuestion> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamQuestion selectById(ExamQuestion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ExamQuestion> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
