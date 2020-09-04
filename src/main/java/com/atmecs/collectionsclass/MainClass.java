package com.atmecs.collectionsclass;

import java.util.*;

public class MainClass 
{
	String name , department , designation;
	int id , salary;
	static Scanner sc;
	static String option;
	static Map<String, List<String>> m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		m = new HashMap<String, List<String>>(); 
		do
		{
			System.out.println("Welcome!! Select the action you want to perform , \n1.Add a record \n2.Search a record with id \n3.Delete record with id \n4.Display all records");
			int input = sc.nextInt();
			switch(input)
			{
			case 1:
			{
				AddRecord a = new AddRecord();
				a.add();
				System.out.println("Record added successfully!!");
				break;
			}
			case 2:
			{
				SearchRecord sr = new SearchRecord();
				sr.searchRecords();
				break;
			}
			case 3:
			{
				DeleteRecord d = new DeleteRecord();
				d.deleteRecords();
				break;
			}
			case 4:
			{
				DisplayRecord d = new DisplayRecord();
				d.dispRecords();
				break;
			}
			default:
			{
				System.out.println("Invalid selection ");
			}
			}
			System.out.println("Do you want to continue your action?? Press Y for yes and N for no...");
			option = sc.next();
		}while(option.equalsIgnoreCase("y"));
		System.out.println("Program exited...");
	}
}
