package com.example.SpringJDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	@Value("${mysql.username}")
	private String username;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.url}")
	private String url;

	@Value("${mysql.driver}")
	private String driver;

	public void display() {

		System.out.println(" UserName: " + username + "\n Password: " + password + "\n Url: " + url + "\n Driver: " + driver);

	}
	
	// not working
	public void getJDBCConnection() throws Exception{
		// TODO Auto-generated method stub
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful: " + connection);

	}

}
