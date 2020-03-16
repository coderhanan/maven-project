package com.nttdata.maven.Member_Emp_Manager;

public class Manager extends Members {
	String specialism;
	String department;
	
	void mang (String name, int age, long phone, String addr, double salary, String special, String dep) {
		this.name = name;
		this.age = age;
		this.phoneNum = phone;
		this.address = addr;
		this.salary = salary;
		this.specialism = special;
		this.department = dep;
	}
}
