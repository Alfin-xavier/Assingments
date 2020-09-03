package com.atmecs.collections;

import java.util.*;

public class AddRecord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String emp_name,dept_name,designation;
		int emp_id,salary,list,index;
		ArrayList arraylist=new ArrayList();
		System.out.println("Enter the number of employee you want to add:");
		list=sc.nextInt();
		System.out.println("Enter the details\n");
		for(index=0;index<list;index++) 
		{
			System.out.println("Enter employee id:");
			emp_id=sc.nextInt();
			System.out.println("Enter emplyoee name:");
			emp_name=sc.next();
			System.out.println("Enter employee department:");
			dept_name=sc.next();
			System.out.println("Enter employee designation:");
			designation=sc.next();
			System.out.println("Enter employee salary:");
			salary=sc.nextInt();
			arraylist.add(emp_id);
			arraylist.add(emp_name);
			arraylist.add(dept_name);
			arraylist.add(designation);
			arraylist.add(salary);
		}
		System.out.println(arraylist);
	}
}
