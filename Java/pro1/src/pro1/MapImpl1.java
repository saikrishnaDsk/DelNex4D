package pro1;



import java.util.ArrayList;
import java.util.HashMap;

public class MapImpl1 {

public static void main(String[] args) {

Student s1=new Student(17, "Prachi", 1, 5, 100);
Student s2=new Student(17, "Sai", 2, 5, 100);
Student s3=new Student(17, "sameer", 3, 5, 100);
Student s4=new Student(17, "mohan", 4, 5, 100);

Student s5=new Student(17, "Pooja", 5, 3, 100);
Student s6=new Student(17, "Anushka", 1, 3, 100);
Student s7=new Student(17, "virat", 2, 3, 100);
Student s8=new Student(17, "MSD", 3, 3, 100);

ArrayList<Student> sem5=new ArrayList<>();

sem5.add(s1);
sem5.add(s2);
sem5.add(s3);
sem5.add(s4);


ArrayList<Student> sem3=new ArrayList<>();
sem3.add(s5);
sem3.add(s6);
sem3.add(s7);
sem3.add(s8);





HashMap<Integer, ArrayList<Student>> studs=new HashMap();


studs.put(5, sem5);
studs.put(3, sem3);


ArrayList<Student> getStuds=studs.get(5);


for(Student s:getStuds)
{
System.out.println(s);
}



}
}
