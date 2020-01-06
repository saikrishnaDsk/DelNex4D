package com.myjdbc.service;

import com.myjdbc.dao.StudentDao;
import com.myjdbc.model.Student;

public class StudentService {

	public static void main(String[] args) {

//		Student student = new Student(101,1,"RAJA","Male",7,100);
		StudentDao dao = new StudentDao();
//		String res = dao.saveStudent(student);

//		if(res.contains("success"))
//			System.out.println("Records Inserted");
		Student stud= dao.getStudById(101);

		System.out.println(stud);
	}

}
