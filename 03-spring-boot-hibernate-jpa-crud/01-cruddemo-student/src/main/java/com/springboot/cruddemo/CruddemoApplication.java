package com.springboot.cruddemo;

import com.springboot.cruddemo.DAO.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.cruddemo.Entity.student;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CruddemoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//createstudent(studentDAO);
			//createMultiplestudent(studentDAO);
			//readstudent(studentDAO);
			//queryforstudent(studentDAO);
			//queryforstudentbylastname(studentDAO);
			//updatestudent(studentDAO);
			//deletestudent(studentDAO);
			deleteAll(studentDAO);

		};

}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("delete all student");
		int numrowdelteed=studentDAO.deltetAll();
		System.out.println(numrowdelteed);
	}

	private void deletestudent(StudentDAO studentDAO) {
		int studentid=2;
		System.out.println("delete student"+studentid);
		studentDAO.delete(studentid);
	}

	private void updatestudent(StudentDAO studentDAO) {
		int studentid= 1;
		System.out.println
				("get student with id"+ studentid);
		student mystudent=studentDAO.findbyid(studentid);
		//change firstname
		System.out.println("updating ");
		mystudent.setFirstname("toutou");
		studentDAO.update(mystudent);
		System.out.println(mystudent);
	}

	private void queryforstudentbylastname(StudentDAO studentDAO) {
		List<student> thestudent=studentDAO.findbylastname("Mohamed");
		for (student stu:thestudent){
			System.out.println(stu);
		}
	}

	private void queryforstudent(StudentDAO studentDAO) {
		List<student> thestudent=studentDAO.findAll();
		for (student stu:thestudent){
			System.out.println(stu);
		}
	}

	private void readstudent(StudentDAO studentDAO) {
		//create student
		student stu1= new student("cc","Moahmed","rb@gmail.com");
		//save student
		studentDAO.save(stu1);
		//display the id of student
		int theid= stu1.getId();
		System.out.println(theid);
		//find student
		student findid=studentDAO.findbyid(theid);
		//displaystudent
		System.out.println(findid);
	}

	private void createMultiplestudent(StudentDAO studentDAO) {
		student news1= new student("Rabab","Moahmed","rb@gmail.com");
		student news2= new student("Rabab","Moahmed","rb@gmail.com");
		student news3= new student("Rabab","Moahmed","rb@gmail.com");


		//save the student object
		studentDAO.save(news1);
		studentDAO.save(news2);
		studentDAO.save(news3);

	}

	private void createstudent(StudentDAO studentDAO){
   //create student object
	System.out.println("ccreate new student");
	student news= new student("Rabab","Moahmed","rb@gmail.com");
	//save the student object
	studentDAO.save(news);

}

}

