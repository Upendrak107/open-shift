package com.aman.java.student.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://den1.mssql7.gear.host;databaseName=mssqldb4;";
	private String usr = "mssqldb4";
	private String pd = "Cy3ae_noGbM-";

	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, usr, pd);
	}

}
