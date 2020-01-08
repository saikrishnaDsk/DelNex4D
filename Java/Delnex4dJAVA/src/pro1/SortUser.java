package pro1;

import java.util.ArrayList;
import java.util.Collections;

public class SortUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User us1 = new User(1,"xyz","abc");
		User us2 = new User(2,"xyz123","abc32455");
		User us3 = new User(3,"xyzadas","a123");
		User us4 = new User(4,"13123","xyz");
		User us5 = new User(5,"safz","abc@gkma");
		
		ArrayList<User> us= new ArrayList();
		us.add(us3);
		us.add(us2);
		us.add(us4);
		us.add(us1);
		us.add(us5);
		
		for(User x: us) 
		System.out.println(x);
		
		System.out.println("After Sorting");
		Collections.sort(us);
		
		for(User x: us) 
			System.out.println(x);
		
	}

}
