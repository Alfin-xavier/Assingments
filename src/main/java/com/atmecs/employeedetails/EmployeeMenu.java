package com.atmecs.employeedetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class EmployeeMenu 
{

	public static void main(String[] args) throws IOException 
	{
		Map<Integer, Employee> employeeRecord=new HashMap<Integer,Employee>();
		EmployeeOperations operations=new EmployeeOperations();
		Scanner scanner=new Scanner(System.in);
		int option;
		String choose;
		do
		{
			System.out.println("\t\t\t\t** Employee Details **\n");
			System.out.println("1.Add Record 2.Search Record 3.Delete Record 4.Update Record 5.Display Record 6.Write File 7.Read File \n");
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
				System.out.println("Record has been deleted..");
				break;
			case 4:
				System.out.println("Enter id to update Record:");
				empid=scanner.nextInt();
				Employee employee3=operations.updateRecord(empid, employeeRecord);
				break;
			case 5:
				System.out.println("\t** Employee Record **\n");
				operations.displayRecord(employeeRecord);
				break;
			case 6:
				File file=new File("C:\\Users\\alfin.anthonyraj\\Desktop\\empdet.txt");
				PrintStream stream=new PrintStream(file);
				PrintStream console = System.out;
				System.out.println("Record has been printed in your file..!!");
				System.setOut(stream);
				Employee employee4=operations.fileoperations(employeeRecord);
				System.setOut(console); 
				break;
			case 7:
				Employee employee5=operations.readFile();
				System.out.println("File has been read successfully");
				break;
			default:
				System.out.println("Invalid Selection\n");
			}
			System.out.println("Do you want to continue? Yes or No\n");
			choose=scanner.next();
		}
		while(choose.equals("yes"));
	}

}
