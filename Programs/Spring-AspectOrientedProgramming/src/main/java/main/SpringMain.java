package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeService;

public class SpringMain {
	
	public static void main(String args[]){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Vishakha");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
