package com.nttdata.maven.Employee_Salary;


public class App 
{
    public static void main( String[] args )
    {
        Employee myEmp = new Employee();
        myEmp.getInfo();
        myEmp.AddSal();
        myEmp.AddWork();
        myEmp.printSalaryHours();
    }
}
