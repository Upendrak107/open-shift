package com.aman.vaadin.student.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://den1.mssql7.gear.host;databaseName=mssqldb4";
	private String user = "mssqldb4";
	private String pass = "Cy3ae_noGbM-";

	// Method to establish connection
	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, user, pass);
	}
	
}
