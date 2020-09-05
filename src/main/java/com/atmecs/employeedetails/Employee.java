package com.atmecs.employeedetails;

public class Employee 
{
	int empid,salary;
	String empname,department,designation;
	
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public String getEmpname()
	{
		return empname;
	}
	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
}
