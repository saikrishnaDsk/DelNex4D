package pro1;

import java.util.HashMap;

public class Showroom {

	public static void main(String[] args) {
		Car1 c1 = new Car1("Volvo",4000000,"Red");
		Car1 c2 = new Car1("BMW",4500000,"DARK BLUE");
		Car1 c3 = new Car1("SKODA",1500000,"BLACK");

		HashMap<String,Car1>cr = new HashMap();

		cr.put(c1.getName(),c1);
		cr.put(c2.getName(),c2);
		cr.put(c3.getName(),c3);


		Car1 cc1 = cr.get("Volvo");

		System.out.println(cc1);
	}

}