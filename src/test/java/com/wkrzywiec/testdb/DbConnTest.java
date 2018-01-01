package com.wkrzywiec.testdb;

import java.sql.*;

public class DbConnTest {

	public static void main(String[] args) {
		String user = "crm-spring";
		String password = "crm-spring";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/crm_spring_db?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String driver ="com.mysql.jdbc.Driver";
		
		try {
			System.out.println("Connecting to the database: " + jdbcUrl);
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Successful connection!!");
			
			conn.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
		}

	}

}
