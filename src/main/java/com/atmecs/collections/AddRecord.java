package com.atmecs.collections;

import java.util.*;

public class AddRecord 
{
	
	public static String emp_name,dept_name,designation;
	public static int emp_id,salary,list,index;
	public static ArrayList arraylist=new ArrayList();
	Scanner sc=new Scanner(System.in);
	void addRecord()
	{
		
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
		//System.out.println(arraylist);
	
	}
	public static void main(String[] args)
	{
		int choice;
		String op;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("1.Add Record\n 2.Search Record\n ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			AddRecord ar=new AddRecord();
			ar.addRecord();
			break;
		case 2:
			SearchRecord sr=new SearchRecord();
			sr.search();
			break;
			default:
				System.out.println("Invalid Selection!!");
		}
		System.out.println("Do you want to continue? YES or No \n");
		op=sc.next();
		}
		while(op.equals("yes"));
	}
}
