package dao;

import java.util.ArrayList;

import entity.GroupAccount;

public class GroupAccount_DAO implements DAOInterface<GroupAccount>{
	
	public static GroupAccount_DAO getInstance () {
		return  new GroupAccount_DAO();
	}

	@Override
	public int insert(GroupAccount t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GroupAccount t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GroupAccount t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<GroupAccount> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupAccount selectById(GroupAccount t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<GroupAccount> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

}
