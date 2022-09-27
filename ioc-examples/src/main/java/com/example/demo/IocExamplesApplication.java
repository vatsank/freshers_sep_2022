package com.example.demo;

import org.apache.naming.factory.BeanFactory;
import org.example.demo.School;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.example.demo"})
public class IocExamplesApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	factory = SpringApplication.run(IocExamplesApplication.class, args);
	
	   //   Student obj  = factory.getBean("dummy",Student.class);
	      
	    //     System.out.println(obj);
	         
	         Student ram = factory.getBean("ram",Student.class);
	         
	         Teacher teacher =factory.getBean("teacher",Teacher.class);
	         
	         teacher.getStudentList().forEach(System.out::println);
	         
	         System.out.println(factory.getBean(School.class));
	         
	         
	         System.out.println(factory.getBean(School.class));
	         
	         System.out.println(factory.getBean("java",Book.class));
	         

	         
	}

	@Bean
	public Student ram() {
		
		return new Student(120, "Ram", 92);
	}
	
	@Bean
	public Student shyam() {
		
		return new Student(125, "Shyam", 98);
	}
	
	@Bean
	public Student magesh() {
		
		return new Student(225, "Magesh", 87);
	}
	
	@Bean
	@Primary
	public School kv() {
		
		return new School("Kendriya Vidyalaya-Bangalore");
		
	}
	
	@Bean
	public School dav() {
		
		return new School("Dav-Bangalore");
		
	}
	
	@Bean
	public Book java() {
		return new Book("Head First Java",anand());
	}
	
	@Bean
	public Book jsp() {
		return new Book("Mastering JSP",agash());
	}
	
	@Bean
	public Book spring() {
		return new Book("professional spring",anand());
	}
	
	@Bean
	public Author anand() {
		return new Author("Anand", 19239239);
	}
	
	@Bean
	public Author agash() {
		return new Author("Agash", 2393939);

	}
	
}
