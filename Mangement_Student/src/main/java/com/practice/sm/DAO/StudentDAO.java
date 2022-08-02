package com.practice.sm.DAO;

import java.util.List;
import com.practice.sm.api.Student;

public interface StudentDAO {
	List<Student> loadStudents();

	/* void saveStudent(StudentDTO studentDTO); by using dto */
	void saveStudent(Student student);
	
	Student getStudent(int id);

	void update(Student student);

	void deleteStudent(int id);
}
