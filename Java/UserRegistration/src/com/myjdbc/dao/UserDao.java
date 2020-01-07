package com.myjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myjdbc.dbutil.DbConnection;
import com.myjdbc.model.User;

public class UserDao {
	public int generateId() throws SQLException {
		int id;
		Connection con=DbConnection.getConnection();
		String sql="select userseq.nextval from dual";
		PreparedStatement stat= con.prepareStatement(sql);


		ResultSet rs = stat.executeQuery();
		if(rs.next()) {
			id =  rs.getInt(1);
			return id;
		}
		else {
			return -1;
		}
	}

	public String saveUser(User user) {
		try
		{

			Connection con=DbConnection.getConnection();
			String sql="insert into users values(?,?,?,?,?)";
			PreparedStatement stat= con.prepareStatement(sql);
			int id = generateId();
			if(id==-1) {
				return "ID gen fail";
			}
			stat.setInt(1, id);
			stat.setString(2, user.getName());
			stat.setString(3, user.getPassword());
			stat.setString(4, user.getGender());
			stat.setString(5, user.getEmail());

			int  rs = stat.executeUpdate();
			if(rs>0) {
				return "USER REGISTRATION SUCCESS";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return "USER REG FAILED";
		}

		return "Cannot insert Records";
	}
	
	public User getUserByid(String email,String password)
	{
		try
		{

			Connection con=DbConnection.getConnection();
			String sql="select * from users where email=? and password=?";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1, email);
			stat.setString(2, password);
	
			ResultSet rs = stat.executeQuery();

			if(rs.next())
			{
				User us = new User();
				us.setId((rs.getInt("id")));
				us.setName((rs.getString("name")));
				us.setPassword((rs.getString("password")));
				us.setGender((rs.getString("gender")));
				us.setEmail((rs.getString("email")));

				return us;
			}



		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
