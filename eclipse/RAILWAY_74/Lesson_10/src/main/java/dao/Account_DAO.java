package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;

import entity.Account;


public class Account_DAO  implements DAOInterface<Account>{
	
	public static Account_DAO getInstance () {
		return  new Account_DAO();
	}

	@Override
	public int insert(Account t) throws FileNotFoundException, IOException {
		int ketQua =0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);
			
			// buoc 2 tao ra doi tuong preparedstatement
			
	
			
			// buoc 3 thuc thi mot cau lenh SQL
			String sql = "INSERT INTO `Account` 	(email , username	,fullname ,department_id ,position_id,	create_date	)\r\n"
					+ "VALUE							(	?, ?,?,	?,?	,?	)";
			
			
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setString(1,t.getEmail());
			pst.setString(2,t.getUserName());
			pst.setString(3,t.getFullName());
			pst.setInt(4,t.getDepId().getId());
			pst.setInt(5,t.getPositionId().getPsId());
			
	        LocalDate createDate = t.getCreateDate();
	        Date sqlCreateDate = Date.valueOf(createDate);
	        pst.setDate(6, sqlCreateDate);
			
			 ketQua = pst.executeUpdate();
			
			// buoc 4 xu ly ket qua
			System.out.println("Bạn đã thực thi :"+ sql);
			System.out.println("Có "+ ketQua +" dòng bị thay đổi");				
			
					
			
			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	return ketQua;
	}

	@Override
	public int update(Account t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Account t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  void  joinTable() throws FileNotFoundException, IOException {
		

		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);
			
			// buoc 2 tao ra doi tuong statement
			Statement st = connection.createStatement();
			
			// buoc 3 thuc thi mot cau lenh SQL
			String sql = "SELECT l.position_name,m.account_id,m.fullname\r\n"
					+ "FROM `Account` AS m\r\n"
					+ "INNER JOIN `Position` AS l\r\n"
					+ "ON m.position_id = l.position_id;";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			// buoc 4 xu ly ket qua
			while (rs.next()) {
				int account_id = rs.getInt("account_id");
				String fullname = rs.getString("fullname");
				String position_name = rs.getString("position_name");
				
				System.out.println("accountId= "+account_id +" fullname= "+ fullname +" positionName= "+ position_name);
				
				
			
			}
			
			
			
			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ;
		

	}

	@Override
	public Account selectById(Account t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Account> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Account> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSelectByName(Account t) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelectById(Account t) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteUsingProcedure(Account t) throws FileNotFoundException, IOException, SQLException {
		int ketQua = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			//System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			// kiem tra department id

			if (isSelectById(t)) {

				String sql = "CALL sp_delete_account( ?);";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setInt(1, t.getDepId().getId());
				ketQua = pst.executeUpdate();

				// buoc 4 xu ly ket qua
				System.out.println("Bạn đã thực thi :" + sql);
				System.out.println("Có " + ketQua + " dòng bị thay đổi");

			} else {
				System.out.println("Cannot find department which has id = " + t.getDepId().getId());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			throw new SQLException(" Không thể xóa department có account");
		}

		return ketQua;
	}

}
