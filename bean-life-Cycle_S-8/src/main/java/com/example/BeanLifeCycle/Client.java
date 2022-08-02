package com.example.BeanLifeCycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		/*
		 * StudentDAO dao = new StudentDAO(); dao.selectAllRows();
		 * dao.deleteStudentRecord(2);
		 */
		
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 * StudentDAO studentDAO = context.getBean("studentdao", StudentDAO.class);
		 * studentDAO.selectAllRows();
		 * ((ClassPathXmlApplicationContext)context).close();
		 */
		
		// Another way
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//context.registerShutdownHook();
		//StudentDAO studentDAO = context.getBean("studentdao", StudentDAO.class);
		//studentDAO.selectAllRows();
	    Hello hello = context.getBean("hello", Hello.class);
	    hello.sample();
		
		//context.registerShutdownHook(); //another way for closing container
		//context.close();

	}

}
