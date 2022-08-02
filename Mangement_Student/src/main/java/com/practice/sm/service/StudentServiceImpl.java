package com.practice.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.sm.DAO.StudentDAO;
import com.practice.sm.api.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = studentDAO.loadStudents();
		return studentList;
	}
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		//Write the business logic or company criteria
		if (student.getCountry().equals("UK")) {
			System.out.println("mail sent to : "+ student.getName());
		}
		
		studentDAO.saveStudent(student);
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		return studentDAO.getStudent(id);
	}
	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
		studentDAO.update(student);
		
	}
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(id);
	}

}
