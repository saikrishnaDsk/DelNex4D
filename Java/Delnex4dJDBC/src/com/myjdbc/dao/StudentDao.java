package com.myjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myjdbc.dbutil.DbConnection;
import com.myjdbc.model.Student;

public class StudentDao {

	public String saveStudent (Student student) {
		try {
			Connection con = DbConnection.getConnection();
			String sql = "insert into student values(?,?,?,?,?,?)";
			PreparedStatement stat = con.prepareStatement(sql);

			stat.setInt(1,student.getStudentId());
			stat.setInt(2,student.getCollegeCode());
			stat.setString(3,student.getStudentName());
			stat.setString(4,student.getGender());
			stat.setInt(5,student.getSem());
			stat.setInt(6,student.getMarks());

			int res = stat.executeUpdate();
			if(res>0)
				return "success";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Exception while Inserting Records";
		}
		return "Cannot Insert Records";
	}
}
