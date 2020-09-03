package com.atmecs.collections;

public class DisplayRecord extends AddRecord
{
	public void display()
	{
		System.out.println("Name:"+ emp_name);
		System.out.println("Department:"+ dept_name);
		System.out.println("Designation:"+ designation);
		System.out.println("Salary:"+ salary);
	}
}
