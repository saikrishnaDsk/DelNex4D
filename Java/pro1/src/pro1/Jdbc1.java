package pro1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DRIVER LOADED");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","delnex4d","pass");

			System.out.println("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}