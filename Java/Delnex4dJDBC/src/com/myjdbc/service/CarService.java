package com.myjdbc.service;

import com.myjdbc.dao.CarDao;
import com.myjdbc.model.Car;

public class CarService {

	public static void main(String[] args) {
		Car ca=new Car("Maruthi", "Swift","White",400000);
		CarDao dao=new CarDao();
		System.out.println(dao.saveCar(ca));
	}

}
