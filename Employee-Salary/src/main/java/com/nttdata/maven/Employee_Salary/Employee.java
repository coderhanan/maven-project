package com.nttdata.maven.Employee_Salary;

import java.util.Scanner;
	
public class Employee {
	
	static double salary;
	static double hours;
	void getInfo () {
		Scanner usersalary = new Scanner(System.in);
		System.out.println("Enter your salary amount");
		salary = usersalary.nextDouble();
		
		Scanner userhours = new Scanner(System.in);
		System.out.println("Enter number of hours worked");
		hours = userhours.nextDouble();
		
	}
	
	void AddSal() {
		if (salary < 500) {
			salary += 10;
		} else {
			System.out.println("Your income level is more than $500, no top-up for you.");
		}
	}
	
	void AddWork() {
		if (hours > 6) {
			salary += 5;
		} else {
			System.out.println("You have not worked enough hours to earn a bonus.");
		}	
	}
	
	void printSalaryHours () {
		System.out.println("You have earned "+salary+" after working "+hours+" hours.");
	}
}
