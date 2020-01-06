package com.myjdbc.service;

import com.myjdbc.dao.StudentDao;
import com.myjdbc.model.Student;

public class StudentService {

	public static void main(String[] args) {

		Student student = new Student(211,3,"Mohan","Male",7,100);

		StudentDao dao = new StudentDao();
		String res = dao.saveStudent(student);

		if(res.contains("success"))
			System.out.println("Records Inserted");

	}

}
