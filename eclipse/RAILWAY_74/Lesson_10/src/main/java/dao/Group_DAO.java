package dao;

import java.util.ArrayList;

import entity.Group;

public class Group_DAO implements DAOInterface<Group>{
	
	public static Group_DAO getInstance () {
		return  new Group_DAO();
	}

	@Override
	public int insert(Group t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Group t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Group t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Group> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group selectById(Group t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Group> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
