package dao;

import java.util.ArrayList;

import entity.Exam;

public class Exam_DAO implements DAOInterface<Exam>{
	
	public static Exam_DAO getInstance () {
		return  new Exam_DAO();
	}

	@Override
	public int insert(Exam t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Exam t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Exam t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Exam> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam selectById(Exam t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Exam> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
