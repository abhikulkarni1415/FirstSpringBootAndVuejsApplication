package net.JavaVuejs.springboot_backened;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.JavaVuejs.springboot_backened.entity.Employee;
import net.JavaVuejs.springboot_backened.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackenedApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackenedApplication.class, args);}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee.EmployeeBuilder()
                .setFirstName("Abhishek")
                .setLastName("Kulkarni")
                .setEmail("amkulkarni1415@gmail.com")
                .build();
		
		Employee employee2 = new Employee.EmployeeBuilder()
                .setFirstName("Apurva")
                .setLastName("Kulkarni")
                .setEmail("apurva.kul123@gmail.com")
                .build();
		
		Employee employee3 = new Employee.EmployeeBuilder()
                .setFirstName("Mohan")
                .setLastName("Kulkarni")
                .setEmail("mbk9049@gmail.com")
                .build();
		
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		
	}

}
