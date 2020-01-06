package com.myjdbc.model;

public class Student {

	private int studentId;
	private int collegeCode;
	private String studentName;
	private String gender;
	private int sem;
	private int marks;



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int studentId, int collegeCode, String studentName, String gender, int sem, int marks) {
		super();
		this.studentId = studentId;
		this.collegeCode = collegeCode;
		this.studentName = studentName;
		this.gender = gender;
		this.sem = sem;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", collegeCode=" + collegeCode + ", studentName=" + studentName
				+ ", gender=" + gender + ", sem=" + sem + ", marks=" + marks + "]";
	}


}
