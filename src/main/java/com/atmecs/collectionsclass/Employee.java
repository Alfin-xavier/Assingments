package com.atmecs.collectionsclass;

import java.util.*;

public class Employee 
{
	String name , department , designation;
	int id , salary;
	static Scanner sc;
	static String option;
	static Map<Integer, List<String>> m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		m = new HashMap<Integer, List<String>>(); 
		do
		{
			System.out.println("1. Addrecord  2.Search Record  3.Delete Record  4.Display Record\n");
			System.out.println("Which operation you want to perform:");
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
			System.out.println("Do you want to continue?\n");
			option = sc.next();
		}
		while(option.equals("yes"));
		System.out.println("Program exited...");
	}
}
