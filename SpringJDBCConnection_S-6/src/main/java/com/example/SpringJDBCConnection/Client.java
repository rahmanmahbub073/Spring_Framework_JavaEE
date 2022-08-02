package com.example.SpringJDBCConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConnection jdbcConnection = context.getBean("jdbcConnection", JDBCConnection.class);
		jdbcConnection.display();

	}

}
