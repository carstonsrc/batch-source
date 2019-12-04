package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static Connection connection;

// grab connection to the database

public static Connection getConnection() throws SQLException {
	
	if(connection == null || connection.isClosed()) {
		connection = DriverManager.getConnection(url, username, password);
	}
	
	return connection;
}
}