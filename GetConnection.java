package com.connector;

import java.awt.Desktop.Action;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

static Connection connection = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		
		return connection;
		
	}
}
