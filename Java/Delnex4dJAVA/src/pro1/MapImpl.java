package pro1;


import java.util.HashMap;

public class MapImpl {

	public static void main(String[] args) {

		Student s1=new Student(17, "Prachi", 1, 5, 100);
		Student s2=new Student(17, "Sai", 2, 5, 100);
		Student s3=new Student(17, "sameer", 3, 5, 100);
		Student s4=new Student(17, "mohan", 4, 5, 100);
		Student s5=new Student(17, "Pooja", 5, 5, 100);


		HashMap<Integer, Student> studs=new HashMap();

		studs.put(s1.getRollNo(), s1);
		studs.put(s2.getRollNo(), s2);
		studs.put(s3.getRollNo(), s3);
		studs.put(s4.getRollNo(), s4);
		studs.put(s5.getRollNo(), s5);


		System.out.println("-----------------------");
		// 4 5  3 4  4 1  1 4 1 1 4 4 4 4 4 4 4  5  5 5 5  5
		Student student1=studs.get(5);
		Student student2=studs.get(4);

		System.out.println(student1);
		System.out.println(student2);


	}
}