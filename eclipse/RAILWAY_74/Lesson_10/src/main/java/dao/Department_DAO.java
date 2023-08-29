package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class Department_DAO implements DAOInterface<Department> {

	public static Department_DAO getInstance() {
		return new Department_DAO();
	}

	@Override
	public int insert(Department t) throws FileNotFoundException, IOException {
		int ketQua = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			// kiem tra ten department
			if (isSelectByName(t)) {
				System.out.println("Department Name isExists!");
			} else {

				String sql = "INSERT INTO Department (department_name) VALUE(?)";

				PreparedStatement pst = connection.prepareStatement(sql);

				pst.setString(1, t.getName());

				ketQua = pst.executeUpdate();

				// buoc 4 xu ly ket qua
				System.out.println("Bạn đã thực thi :" + sql);
				System.out.println("Có " + ketQua + " dòng bị thay đổi");

			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public int update(Department t) throws FileNotFoundException, IOException, SQLException {
		int ketQua = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			// kiem tra department id

			if (isSelectById(t)) {

				if (isSelectByName(t)) {
					System.out.println("Department Name isExists!");
				} else {
					String sql = "UPDATE Department SET  department_name = ?" + "WHERE department_id = ?;";

					PreparedStatement pst = connection.prepareStatement(sql);

					pst.setString(1, t.getName());
					pst.setInt(2, t.getId());

					ketQua = pst.executeUpdate();

					// buoc 4 xu ly ket qua
					System.out.println("Bạn đã thực thi :" + sql);
					System.out.println("Có " + ketQua + " dòng bị thay đổi");
				}

			} else {
				System.out.println("Cannot find department which has id = " + t.getId());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(Department t) throws FileNotFoundException, IOException, SQLException {
		int ketQua = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			// kiem tra department id

			if (isSelectById(t)) {

				String sql = "DELETE FROM Department WHERE department_id = ?;";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setInt(1, t.getId());
				ketQua = pst.executeUpdate();

				// buoc 4 xu ly ket qua
				System.out.println("Bạn đã thực thi :" + sql);
				System.out.println("Có " + ketQua + " dòng bị thay đổi");

			} else {
				System.out.println("Cannot find department which has id = " + t.getId());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			throw new SQLException(" Không thể xóa department có account");
		}

		return ketQua;
	}

	@Override
	public List<Department> selectAll() throws FileNotFoundException, IOException, SQLException {
		List<Department> departments = new ArrayList<>();

		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL
			String sql = "SELECT * FROM Department";
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			// buoc 4 xu ly ket qua

			while (rs.next()) {
				int id = rs.getInt("department_id");
				String name = rs.getString("department_name");
				Department department = new Department(id, name);
				departments.add(department);
				System.out.println(department.toString());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw e;
		}

		return departments;
	}

	@Override
	public Department selectById(Department t) throws FileNotFoundException, IOException, SQLException {

		Department department = null;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM Department WHERE department_id = ?";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, t.getId());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				String name = rs.getString("department_name");
				department = new Department(t.getId(), name);
				System.out.println("Department found: " + department.getName());
			} else {
				System.out.println("Cannot find department which has id = " + t.getId());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw e;
		}

		return department;
	}

	@Override
	public ArrayList<Department> selectByCondition(String codition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void joinTable() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSelectByName(Department t) throws FileNotFoundException, IOException, SQLException {

		boolean check = false;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM Department WHERE department_name = ?";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getName());
			ResultSet rs = pst.executeQuery();

			if ((rs.next())) {
				System.out.println(check = true);
			} else {
				System.out.println(check);
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw e;
		}

		return check;
	}

	@Override
	public boolean isSelectById(Department t) throws FileNotFoundException, IOException, SQLException {
		boolean check = false;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			String sql = "SELECT * FROM Department WHERE department_id = ?";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, t.getId());
			ResultSet rs = pst.executeQuery();

			if ((rs.next())) {
				System.out.println(check = true);
			} else {
				System.out.println(check);
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);

		} catch (SQLException e) {
			// Ném ngoại lệ lên frontend để xử lý
			throw e;
		}

		return check;
	}

	@Override
	public int deleteUsingProcedure(Department t) throws FileNotFoundException, IOException, SQLException {
		int ketQua = 0;
		try {
			// buoc 1 tao ket noi
			Connection connection = JDBCUtil.getConnection();
			//System.out.println(connection);

			// buoc 2 tao ra doi tuong preparedstatement

			// buoc 3 thuc thi mot cau lenh SQL

			// kiem tra department id

			if (isSelectById(t)) {

				String sql = "CALL sp_delete_department( ?);";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setInt(1, t.getId());
				ketQua = pst.executeUpdate();

				// buoc 4 xu ly ket qua
				System.out.println("Bạn đã thực thi :" + sql);
				System.out.println("Có " + ketQua + " dòng bị thay đổi");

			} else {
				System.out.println("Cannot find department which has id = " + t.getId());
			}

			// buoc 5 ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			throw new SQLException(" Không thể xóa department có account");
		}

		return ketQua;
		
	}

}
