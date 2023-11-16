package com.springboot.cruddemo;

import com.springboot.cruddemo.DAO.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.cruddemo.Entity.student;
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
			createMultiplestudent(studentDAO);
		};

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

