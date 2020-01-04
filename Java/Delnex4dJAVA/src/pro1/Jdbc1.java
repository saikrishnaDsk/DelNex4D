package pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DRIVER LOADED");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","delnex4d","pass");
			
			String sql = "insert into college values(111,'jdbc',0)";
			PreparedStatement stat = conn.prepareStatement(sql);
			stat.executeUpdate();
			
			System.out.println("Connected");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}