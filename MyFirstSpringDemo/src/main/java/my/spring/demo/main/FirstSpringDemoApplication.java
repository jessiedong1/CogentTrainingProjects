package my.spring.demo.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import my.spring.demo.EmployeeDAO;

@SpringBootApplication
@ComponentScan("my.spring.demo")
public class FirstSpringDemoApplication {
	@Autowired
	EmployeeDAO dao;
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(FirstSpringDemoApplication.class, args);
		EmployeeDAO dao = ctx.getBean(EmployeeDAO.class);
		System.out.println(dao.display());
		
	}



}
