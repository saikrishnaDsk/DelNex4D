package pro1;

import java.util.Scanner;

public class Car {
	//static int num =0;
	String brand;
	String model;
	String color;
	double price;

	public String details() {
		String det = "Brand: "+brand+"\nModel: "+model+"\nColor: "+color+"\nPrice: "+price;
		return det;
	}
	public Car(String brand,String model,String color,double price) {

		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
	}

	public static void main(String [] args) {
		Car t = new Car("Volvo","S60","red",4500000);
		System.out.println(t.details());
	}

}
