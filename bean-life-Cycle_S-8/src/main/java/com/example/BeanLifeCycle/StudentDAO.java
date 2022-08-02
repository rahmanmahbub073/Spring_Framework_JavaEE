package com.example.BeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

/**
 * Hello world!
 *
 */
public class StudentDAO {
	
	//we will declare this in the beans.xml if we wrote like this we dont need the IOC container and we need Test class
	private String driver; // = "com.mysql.cj.jdbc.Driver";

	private String url; // = "jdbc:mysql://localhost:3306/Student_Management?useSSL=false";

	private String username; // = "root";

	private String password; // = "Ammajan@0011";
	
	//another way to close connection
	Connection connection;
	//if we declare field in beans we have to add setters and getters
	

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		createStudentDBConnection();
	}
	//@PostConstruct
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		// load driver
				Class.forName(driver);
				// get a connection
				connection = DriverManager.getConnection(url, username, password);
	}
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		System.out.println("Retriving all student");
		
		//we have to give this method in every utility like this . Instead of we can use @postconstruct 
		createStudentDBConnection(); // it will disclose the null exception 
		
		// load driver
		//Class.forName(driver);
		// get a connection
		//Connection connection = DriverManager.getConnection(url, username, password);

		// execute query
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student_Management.students");

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			double mobile = rs.getDouble(3);
			String country = rs.getString(4);

			System.out.println(id + " " + name + " " + mobile + " " + country + " ");

		}
		System.out.println("Connection Successful: " + connection);

		//connection.close(); // we have to close connection for security puposes
	}

	public void deleteStudentRecord(int id) throws SQLException, ClassNotFoundException {
		createStudentDBConnection();
		// load driver
		//Class.forName(driver);
		// get a connection
		//Connection connection = DriverManager.getConnection(url, username, password);

		// execute query
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("delete from Student_Management.students where id = " + id);
        System.out.println("Record deleted with the id " + id);
        
        //connection.close();
	}
	
	
	public void closeConnection() throws SQLException {
		connection.close();
	}
	
	//@PreDestroy // we have used it beans
	public void destroy() throws SQLException {
		
		System.out.println("Destroy method called");
		closeConnection();
	}

}