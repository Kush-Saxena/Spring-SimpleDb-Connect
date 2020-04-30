package com.kk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbUtil {

	@Value("${db.conn.driver}")
	private String connectionDriver;

	@Value("${db.conn.url}")
	private String connectionUrl;

	@Value("${db.conn.username}")
	private String connectionUsername;

	@Value("${db.conn.password}")
	private String connectionPassword;

	// Using try-catch to handle Exceptions
	public Connection getConnection() {
		Connection conn = null;

		try { // Class.forName(connectionDriver); //Optional in java version > 5

			conn = DriverManager.getConnection(connectionUrl, connectionUsername, connectionPassword);

			System.out.println("Connection Being made");
		} catch (Exception e) {

			System.err.println("Some Excetion While making connection/ Connection object will result in null Value");
			e.printStackTrace();

		}

		return conn;

	}

	public void CloseConnection(Connection conn) {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Closing the connection");

			e.printStackTrace();
		}

	}

}
