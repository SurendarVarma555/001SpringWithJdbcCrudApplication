package com.vidvaan.client;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.model.Employee;
import com.vidvaan.service.EmployeeService;
import com.vidvaan.service.EmployeeServiceImpl;

public class Test {
	 private static final Logger logger = LogManager.getLogger(Test.class);  

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService employeeservice = ctx.getBean("employeeservice", EmployeeServiceImpl.class);
		Employee employee = new Employee();
		
		 logger.info("This is an info log entry");
	        logger.error("This is an error log entry");

//		Employee employee=new Employee();
//		employee.setEid(105);
//		employee.setEname("Srikanth");
//		employee.setEsalary(25000);
//		employee.setEmail("sri@gmail.com");

//		employeeservice.addEmployee(employee);
//		employeeservice.deleteEmployeeById(111);
//		employeeservice.fetchEmployeeById(101);
//		employeeservice.updateEmployeeEmailById("rrrr@gmail.com", 110);
//		employeeservice.updateEmployeeEmailById("gdkjsdja@gmail.com", 101);
		employeeservice.getAllEmplyeesInfo();
		ctx.close();
	}

}