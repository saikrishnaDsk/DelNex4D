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

	public String updateStudent(int studentId,Student student) {

		try {
			Student oldData=getStudById(studentId);
			Connection con=DbConnection.getConnection();
			String sql="update student set ccode=?,sname=?,gender=?,sem=?,marks=? where sid=?";
			PreparedStatement stat= con.prepareStatement(sql);
			stat.setInt(6, studentId);

			if(student.getCollegeCode()==0 ) {
				student.setCollegeCode(oldData.getCollegeCode());
			}
			if(student.getSem()==0){
				student.setSem(oldData.getSem());
			}
			if(student.getMarks()==0) {
				student.setMarks(oldData.getMarks());
			}
			if(student.getStudentName()==null) {
				student.setStudentName(oldData.getStudentName());
			}
			if(student.getGender()==null) {
				student.setGender(oldData.getGender());
			}
			stat.setInt(1, student.getCollegeCode());
			stat.setString(2, student.getStudentName());
			stat.setString(3, student.getGender());
			stat.setInt(4, student.getSem());
			stat.setInt(5, student.getMarks());
			
			int res=stat.executeUpdate();
			if(res>0)
				return "rec updated";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Failed";
		}

		return "Fail";
	}
}