package pro1;

public class Student
{

	int age;
	String name;
	int rollNo;
	int sem;
	int marks;


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public Student(int age, String name, int rollNo, int sem, int marks) {
//		super();
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
		this.sem = sem;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", rollNo=" + rollNo + ", sem=" + sem + ", marks=" + marks
				+ "]";
	}


}