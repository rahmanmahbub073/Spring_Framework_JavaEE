package com.practice.sm.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.sm.api.Student;
import com.practice.sm.service.StudentService;

@Controller
public class StudentController {

	// removed it after adding service layer
	//@Autowired 
	//private StudentDAO StudentDAO;
	
	// StudentDAO StudentDAO = new StudentDAOImpl();
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	// @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String showStudentList(Model model) {

		// call the dao method to get data not good for production level app
		// StudentDAO.loadStudents();
		//List<Student> studentList = StudentDAO.loadStudents();
		
		List<Student> studentList = studentService.loadStudents();
		/*
		 * //it's print the db on controll for (Student tempStudent : studentList) {
		 * System.out.print(tempStudent); }
		 */

		model.addAttribute("students", studentList);

		return "Student-list";
	}

	/*
	 * // For StudentDTO class
	 * 
	 * @GetMapping("/showNewStudent") // @RequestMapping(value = "/showStudent",
	 * method = RequestMethod.GET) public String addStudent(Model model) {
	 * StudentDTO studentDTO = new StudentDTO();
	 * 
	 * // model.addAttribute("student",new Student()); model.addAttribute("student",
	 * studentDTO); return "add-student"; }
	 */
	@GetMapping("/showAddStudent")
	// @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String addStudent(Model model) {
		
		Student student = new Student();

		// model.addAttribute("student",new Student());
		model.addAttribute("student", student);
		return "add-student";
	}

	/*
	 * @ResponseBody
	 * 
	 * @GetMapping("/save-student") public String saveStudent() {
	 * 
	 * return "Save student..."; }
	 */
	/*
	 * purpose :1 for console print
	 * 
	 * @ResponseBody
	 * 
	 * @GetMapping("/save-student") public String saveStudent(StudentDTO studentDTO)
	 * {
	 * 
	 * System.out.println(studentDTO);
	 * 
	 * return "Save student..."; }
	 */

	/*
	 * //for the StudentDTO class
	 * 
	 * @ResponseBody
	 * 
	 * @GetMapping("/save-student") public String saveStudent(StudentDTO studentDTO)
	 * {
	 * 
	 * // DB logic in here. saving data in db by studentDTO
	 * System.out.println(studentDTO);
	 * 
	 * // DAO call StudentDAO.saveStudent(studentDTO);
	 * 
	 * return "Save student..."; }
	 */
	/*
	 * //It should be post method but we can also get output by using getmapping
	 * which incorrect if we use "getmapping" it shows our obj in the url. hackers
	 * can find the object easily
	 * 
	 * @ResponseBody
	 * 
	 * @GetMapping("/save-student") public String saveStudent(Student student) {
	 * 
	 * // DB logic in here. saving data in db by studentDTO
	 * System.out.println(student);
	 * 
	 * // DAO call StudentDAO.saveStudent(student);
	 * 
	 * return "Save student..."; }
	 */
	// @ResponseBody
	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		// DB logic in here. saving data in db by studentDTO
		System.out.println(student);
		
		//do condition check
		//if user don't have id the do a insert
		//if the user have id do update
		
		if (student.getId()== 0) {
			//insert a new record
			studentService.saveStudent(student);
		}
		else {
			//do an update
			studentService.update(student);
		}

		// DAO call
		//StudentDAO.saveStudent(student);
		
		// service call
		//studentService.saveStudent(student);

		// return "Save student..."; if we use this return it will harmful
		// beacuse when we refresh the last page after submit. it will add new
		// entity in our databases

		// return "redirect:/thankyou"; // redirect to the thankyou()

		return "redirect:/showStudent"; // redirect to showStudent page
	}
	/*
	 * @ResponseBody
	 * 
	 * @GetMapping("/thankyou") public String thankyou() { return
	 * "Thank You, Your record has been updated"; }
	 */
	/* Antoher way
	 * @GetMapping("/updateStudent") // @RequestMapping(value = "/showStudent",
	 * method = RequestMethod.GET) public String updateStudent(Model model) {
	 * 
	 * Student mystudent = new Student();
	 * 
	 * // model.addAttribute("student",new Student()); model.addAttribute("student",
	 * mystudent); return "add-student"; }
	 */
	
	/*
	 * @GetMapping("/updateStudent") // @RequestMapping(value = "/showStudent",
	 * method = RequestMethod.GET) public String
	 * updateStudent(@RequestParam("userId") int id, @ModelAttribute("student")
	 * Student student) { // we should give the user object who clicked on the
	 * update button System.out.println("Looking the data for student having ID: "+
	 * id);
	 * 
	 * Student theStudent = studentService.getStudent(id);
	 * System.out.println(theStudent);
	 * 
	 * //setting the student information student.setId(theStudent.getId());
	 * student.setName(theStudent.getName());
	 * student.setMobile(theStudent.getMobile());
	 * student.setCountry(theStudent.getCountry());
	 * 
	 * return "add-student"; }
	 */
	
	@GetMapping("/updateStudent")
	// @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String updateStudent(@RequestParam("userId") int id, Model model) {
		// we should give the user object who clicked on the update button
		System.out.println("Looking the data for student having ID: "+ id);
		
		Student theStudent = studentService.getStudent(id);
		System.out.println(theStudent);
		
		model.addAttribute("student",theStudent);

		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	// @RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam("userId") int id, Model model) {
		// capture the id whom you are trying to delete
		//once captured the id, do a service call for delete
		System.out.println("Looking the data for deletion student having ID: "+ id);
		
		studentService.deleteStudent(id);
		
		return "redirect:/showStudent";
	}
}