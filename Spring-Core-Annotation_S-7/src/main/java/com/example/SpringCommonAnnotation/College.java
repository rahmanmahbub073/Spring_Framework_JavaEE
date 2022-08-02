package com.example.SpringCommonAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Md Mahbubur Rahman
 *
 */

// We have another way instead of using @component which is in CollegeConfig
// If don't declare bean id by default it will be "college" to College Class
//@Component ("collegeBean") // we can use this instead of beans.xml config
@Component
@PropertySource("classpath:college-info-properties")
public class College 
{
	//This is hard coding, we wont use it. we will declare it in college-info-properties
	//@Value("Govt. City College")
	//@Value("${college.Name}") //It won't run, we have to use propertySource
	private String collegeName;
	

	//another way if dont use @Value("${college.Name}") in field above
	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	//Principal ia class variable
	@Autowired
	private Principal principal;
	
	//After adding new class ScienceTeacher It wont run cause 
	//for techer interface we have two class. for the running purpose we sould 
	// make one class as a primary using annotation. refer to mathTeacher class
	// and another class we can use @qualifier annotation
	
	//Teacher is Interface Variable
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

/*
    // we don't need to write setter if we use autowired in field method
	//by setter injection
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	// we don't need to write setter if we use autowired in field method
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
*/	
	//by constructor injection 
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */
	
	public void test() {
		
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is : " + collegeName);
		System.out.println("testing the college method");
		
	}
	
}
