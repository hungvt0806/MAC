package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.ArrayList;

import entity.Position;

public class Position_DAO implements DAOInterface<Position>{
	
	public static Position_DAO getInstance () {
		return  new Position_DAO();
	}

	public int insert() throws FileNotFoundException, IOException {
		
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);
			
			// buoc 2 tao ra doi tuong preparedstatement
			
	
			
			// buoc 3 thuc thi mot cau lenh SQL
			String sql = "INSERT INTO `Position`    (	position_name	) VALUE ('Boja' )";
			
			
			PreparedStatement pst = connection.prepareStatement(sql);
			//pst.setString(1, "Boja");
			int ketQua = pst.executeUpdate();
			
			// buoc 4 xu ly ket qua
			System.out.println("Bạn đã thực thi :"+ sql);
			System.out.println("Có "+ ketQua +" dòng bị thay đổi");				
			
					
			
			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int update(Position t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Position t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Position> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position selectById(Position t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Position> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insert(Position t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSelectByName(Position t) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelectById(Position t) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	



}
