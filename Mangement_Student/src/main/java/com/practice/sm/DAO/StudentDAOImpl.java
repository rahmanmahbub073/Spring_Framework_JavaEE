package com.practice.sm.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.practice.sm.api.Student;
import com.practice.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub

		// List<Student> studentList = new ArrayList<>();

		// logic for get student data from db

		String sql = "Select * from students";

		// jdbcTemplate.query(sql, new StudentRowMapper());
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());

		// studentList = theListOfStudent;

		// return studentList;
		return theListOfStudent;
	}

	/*
	 * for the dto class
	 * 
	 * @Override public void saveStudent(StudentDTO studentDTO) { // TODO
	 * Auto-generated method stub //write the logic to store data in db Object[]
	 * sqlParamters=
	 * {studentDTO.getName(),studentDTO.getMobile(),studentDTO.getCountry()}; String
	 * sql = "insert into students(name,mobile,country) values(?,?,?)";
	 * jdbcTemplate.update(sql, sqlParamters);
	 * 
	 * System.out.println("1 record updated"); }
	 */
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		// write the logic to store data in db
		Object[] sqlParamters = { student.getName(), student.getMobile(), student.getCountry() };
		String sql = "insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql, sqlParamters);

		System.out.println("1 record iserted");
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub

		String sql = "Select * from students where id= ?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		String sql = "Update students set name= ?, mobile= ?, country=? Where id =?";
		jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry(), student.getId());
		System.out.println("I record updated");
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Student_Management.students where id= ?";
		jdbcTemplate.update(sql, id);
		System.out.println("I record deleted");
	}
}
