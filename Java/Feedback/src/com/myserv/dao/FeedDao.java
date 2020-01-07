package com.myserv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myjdbc.dbutil.DbConnection;
import com.myserv.model.FeedBack;

public class FeedDao {

	public  String saveFeed(FeedBack feed)
	{
		try
		{
			Connection con= DbConnection.getConnection();
			String sql="insert into feedback values(?,?,?)";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1,feed.getName());
			stat.setString(2,feed.getEmail());
			stat.setString(3,feed.getMessage());
			stat.executeUpdate();



			return "Records Inserted";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "INSERTION FAILED";
		}


	}
}
