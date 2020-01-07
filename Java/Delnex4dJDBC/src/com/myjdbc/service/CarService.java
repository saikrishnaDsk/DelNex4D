package com.myjdbc.service;

import java.util.ArrayList;

import com.myjdbc.dao.CarDao;
import com.myjdbc.model.Car;

public class CarService {

	public static void main(String[] args) {
		CarDao dao = new CarDao();
		//ArrayList<Car> ListCar =  dao.getCarByName("maruti");
		//ArrayList<Car> ListCar =  dao.getAllCars();
		
		ArrayList<Car> ListCar =  dao.getCarBymaker("Alto");
		for(Car car: ListCar) {
			System.out.println(car);
		}

	}

}