package com.atmecs.employeedetails;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeOperations 
{
	Scanner scanner=new Scanner(System.in);
	public Employee addRecord(int empid,String empname,String department,String designation,int salary)
	{
		Employee emp=new Employee();
		emp.setEmpid(empid);
		emp.setEmpname(empname);
		emp.setDepartment(department);
		emp.setDesignation(designation);
		emp.setSalary(salary);
		return emp;
	}
	
	public Employee searchRecord(Integer empid,Map<Integer,Employee> employeeRecord) 
	{
		Employee emp=employeeRecord.get(empid);
		System.out.println("Employee Id:"+emp.getEmpid()+"\n"+"Employee Name:"+emp.getEmpname()+"\n"+"Department:"+emp.getDepartment()+"\n"+"Designation:"+emp.getDesignation()+"\n"+"Salary:"+emp.getSalary()+"\n");
		return null;
	}
	
	public boolean deletRecord(Integer empid,Map<Integer,Employee> employeeRecord) 
	{
		Employee emp=employeeRecord.get(empid);
		employeeRecord.remove(empid);	
		return false;
		
	}
	
	public Employee displayRecord(Map<Integer, Employee> employeeRecord)
	{
		Set<Integer> empId=employeeRecord.keySet();
		for(Integer display: empId)
		{
			Employee emp=employeeRecord.get(display);
			System.out.println("Employee Id:"+emp.getEmpid()+"\n"+"Employee Name:"+emp.getEmpname()+"\n"+"Department:"+emp.getDepartment()+"\n"+"Designation:"+emp.getDesignation()+"\n"+"Salary:"+emp.getSalary()+"\n");
		}
		return null;
	}
	
	public Employee updateRecord(Integer empid,Map<Integer, Employee> employeeRecord)
	{
		Employee emp=employeeRecord.get(empid);
		employeeRecord.put(empid, emp);
		System.out.println("Enter the field you want to modify:");
		String field=scanner.next();
		System.out.println("Enter the new value:");
		if(field.equals("empname"))
		{
			field = scanner.next();
			emp.setEmpname(field);
		}
		if(field.equals("department"))
		{
			field = scanner.next();
			emp.setDepartment(field);
		}
		if(field.equals("designation"))
		{
			field = scanner.next();
			emp.setDesignation(field);
		}
		return null;
	}
	public Employee fileoperations(Map<Integer, Employee> employeeRecord)  
	{
		Set<Integer> empId=employeeRecord.keySet();
		for(Integer display: empId)
		{
			Employee emp=employeeRecord.get(display);
			System.out.println("Employee Id:"+emp.getEmpid()+"\n"+"Employee Name:"+emp.getEmpname()+"\n"+"Department:"+emp.getDepartment()+"\n"+"Designation:"+emp.getDesignation()+"\n"+"Salary:"+emp.getSalary()+"\n");
			
		}
		return null;

	}
	public Employee readFile() throws IOException
	{
	FileReader fr=new FileReader("C:\\Users\\alfin.anthonyraj\\Desktop\\empdet.txt");    
	int i;    
	while((i=fr.read())!=-1)    
	{
		System.out.print((char)i);  
	}
	System.out.println("\n");
	fr.close();
	return null;
	}

}
