package com.atmecs.employeedetails;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EmployeeMenu 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Map<Integer, Employee> employeeRecord=new HashMap<Integer,Employee>();
		EmployeeOperations operations=new EmployeeOperations();
		Scanner scanner=new Scanner(System.in);
		int option;
		String choose;
		do
		{
			System.out.println("\t** Employee Details **\n");
			System.out.println("1.Add Record 2.Search Record 3.Delete Record 4.Update Record 5.Display Record 6.Reading a file\n");
			System.out.println("Select an option :");
			option=scanner.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter Employee Id:");
				int empid=scanner.nextInt();
				System.out.println("Enter Employee Name:");
				String empname=scanner.next();
				System.out.println("Enter Department:");
				String department=scanner.next();
				System.out.println("Enter Destignation:");
				String destignation=scanner.next();
				System.out.println("Enter Salary:");
				int salary=scanner.nextInt();
				
				Employee employee=operations.addRecord(empid, empname, department, destignation, salary);
				employeeRecord.put(employee.empid, employee);
				//System.out.println(employeeRecord);
				break;
			case 2:
				System.out.println("Enter id to search Record:");
				empid=scanner.nextInt();
				Employee employee1=operations.searchRecord(empid, employeeRecord);
				break;
			case 3:
				System.out.println("Enter id to delete Record:");
				empid=scanner.nextInt();
				boolean employee2=operations.deletRecord(empid, employeeRecord);
				break;
			case 4:
				System.out.println("Enter id to search Record:");
				empid=scanner.nextInt();
				Employee employee3=operations.updateRecord(empid, employeeRecord);
				break;
			case 5:
				System.out.println("\t** Employee Details **");
				operations.displayRecord(employeeRecord);
				break;
			case 6:
				File file = new File("C:\\Users\\alfin.anthonyraj\\Desktop\\empdet.txt");
				scanner=new Scanner(file);
				 while (scanner.hasNextLine()) 
				      System.out.println(scanner.nextLine()); 
				scanner.close();
				break;
			default:
				System.out.println("Invalid Selection\n");
			}
			System.out.println("Do you want to continue? Yes or No\n");
			choose=scanner.next();
		}
		while(choose.equals("yes"));
		scanner.close();
	}

}
