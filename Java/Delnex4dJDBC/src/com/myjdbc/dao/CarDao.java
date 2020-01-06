package com.myjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myjdbc.dbutil.DbConnection;
import com.myjdbc.model.Car;

public class CarDao {
	public String saveCar(Car ca) {
		try {
			Connection con= DbConnection.getConnection();
			String sql="insert into car values(?,?,?,?)";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1,ca.getBrand());
			stat.setString(2,ca.getModel());
			stat.setString(3,ca.getColor());
			stat.setDouble(4,ca.getPrice());

			int res=stat.executeUpdate();
			if(res>0)
				return "rec updated";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Failed";
		}
		return null;
	}
}
