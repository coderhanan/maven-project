package com.nttdata.maven.Member_Emp_Manager;

public class Members {
	
	String name;
	int age;
	long phoneNum;
	String address;
	double salary;
	
	void printSalary () {
		System.out.println(salary);
	}
	
	void obje () {

	Employee myEmp = new Employee();
	myEmp.emplo("Employee", 18, 1235678, "Address Line 1", 45000, "Dev", "Apps");
	
	Manager myMan = new Manager();
	myMan.mang("Manager", 25, 12345678, "address line 2", 60000, "Manager", "App services");
	}
	
	
	
}
