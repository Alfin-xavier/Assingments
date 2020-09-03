package com.atmecs.collections;

public class SearchRecord extends AddRecord
{
	public	void search()
	{
		
		System.out.println("Enter employee id to search an employee:");
		emp_id=sc.nextInt();
		if(emp_id==arraylist.get(emp_id))
		{
			display();
		}
	}
	
	public void display()
	{
		System.out.println("Name:"+ emp_name);
		System.out.println("Department:"+ dept_name);
		System.out.println("Designation:"+ designation);
		System.out.println("Salary:"+ salary);
	}
}
