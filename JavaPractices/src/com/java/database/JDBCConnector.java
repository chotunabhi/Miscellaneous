package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnector {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://QTPRMDBDV01.CIQDEV.COM;user=ciqhyd\\asrinviasa;password=Abhi@1005;database=CapitalIQ");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = "select * from testing_table";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("txt_title"));
		}
	}

}
