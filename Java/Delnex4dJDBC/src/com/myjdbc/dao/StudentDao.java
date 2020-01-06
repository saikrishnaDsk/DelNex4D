package com.myjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myjdbc.dbutil.DbConnection;
import com.myjdbc.model.Student;

public class StudentDao {

	public Student getStudById(int studentId)
	{
	try
	{

	Connection con=DbConnection.getConnection();
	String sql="select * from student where sid=?";
	PreparedStatement stat= con.prepareStatement(sql);

	stat.setInt(1, studentId);

	ResultSet rs = stat.executeQuery();

	if(rs.next())
	{
	Student stud=new Student();

	stud.setStudentId(rs.getInt("sid"));
	stud.setCollegeCode(rs.getInt("ccode"));
	stud.setStudentName(rs.getString("sname"));
	stud.setGender(rs.getString("gender"));
	stud.setSem(rs.getInt("sem"));
	stud.setMarks(rs.getInt("marks"));

	return stud;
	}



	}
	catch (Exception e) {
	e.printStackTrace();
	}

	return null;
	}
}
