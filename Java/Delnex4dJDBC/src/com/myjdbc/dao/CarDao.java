package com.myjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.myjdbc.dbutil.DbConnection;
import com.myjdbc.model.Car;

public class CarDao {

	public ArrayList<Car> getCarByName(String name){
		try {
			ArrayList <Car> carList= new ArrayList();
			Connection conn = DbConnection.getConnection();
			//System.out.println(name);
			String sql = "select * from car where upper(name) = ?"; 
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name.toUpperCase());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//System.out.println("Here");
				do {
					Car car = new Car();
					car.setName(name);
					car.setMaker(rs.getString("maker"));
					car.setSerialNo(rs.getInt("serialno"));
					carList.add(car);
				}while(rs.next());
				return carList;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Car> getAllCars(){
		try {
			ArrayList <Car> carList= new ArrayList();
			Connection conn = DbConnection.getConnection();
			String sql = "select * from car"; 
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//System.out.println("Here");
				do {
					Car car = new Car();
					car.setName(rs.getString("name"));
					car.setMaker(rs.getString("maker"));
					car.setSerialNo(rs.getInt("serialno"));
					carList.add(car);
				}while(rs.next());
				return carList;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Car> getCarBymaker(String maker){
		try {
			ArrayList <Car> carList= new ArrayList();
			Connection conn = DbConnection.getConnection();
			//System.out.println(name);
			String sql = "select * from car where upper(maker) = ?"; 
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, maker.toUpperCase());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//System.out.println("Here");
				do {
					Car car = new Car();
					car.setName(rs.getString("name"));
					car.setMaker(rs.getString("maker"));
					car.setSerialNo(rs.getInt("serialno"));
					carList.add(car);
				}while(rs.next());
				return carList;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}