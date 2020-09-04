package com.atmecs.employee_records;

import java.util.*;

public class GettingInputs 
{
	static ArrayList<Object> list=new ArrayList<Object>();
	static Scanner sc=new Scanner(System.in);
	static String name,dept_name,designation;
	static int id,salary;
		
	static public String getname()
	{
		return name;
	}
	static public String getdept_name()
	{
		return dept_name;
	}
	static public String getdesignation()
	{
		return designation;
	}
	static public int getid()
	{
		return id;
	}
	static public int getsalary()
	{
		return salary;
	}
	
	static public void input()
	{
		
		System.out.println("Enter Name: ");
		name=sc.next();
		list.add(getname());
		System.out.println("Enter Department: ");
		dept_name=sc.next();
		list.add(getdept_name());
		System.out.println("Enter Designation: ");
		designation=sc.next();
		list.add(getdesignation());
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		list.add(getsalary());
		//System.out.println(list);
	}

	public void display()
	{
		System.out.println("Id : "+getid()+"\n"+"Name : "+getname()+"\n"+"Department : "+getdept_name()+"\n"+"Designation : "+getdesignation()+"\n"+"Salary : "+getsalary());
	}
	
	public static void main(String[] arg)
	{
		
		System.out.println("Enter The details: ");
		GettingInputs.input();
		
	}
}

