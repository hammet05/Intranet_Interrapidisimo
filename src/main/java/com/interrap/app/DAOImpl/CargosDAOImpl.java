package com.interrap.app.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.interrap.app.DAO.ICargoDAO;
import com.interrap.app.model.cargos;

public class CargosDAOImpl implements ICargoDAO
{
	final String INSERT="INSERT INTO emp_cargo(cargo,salario,id_area,Estado,Id_Contrato)VALUES(?,?,?,?,? )";
	private DataSource dataSource;
	Connection conn = null;
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}
	@Override
	public void insert(cargos _cargo) {
		
		try {
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(INSERT);
			ps.setInt(1, _cargo.getId());
			ps.setString(2, _cargo.getCargo());
			
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
