package com.myjdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","delnex4d","pass");
			System.out.println("DRIVER LOADED");
			return conn;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}