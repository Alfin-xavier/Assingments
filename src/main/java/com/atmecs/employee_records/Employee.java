package com.atmecs.employee_records;

import java.util.*;

public class Employee 
{
	
	public static void main(String[] args)
	{
		int choice;
		String op;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t** Collection Class **\n");
		do
		{
		System.out.println("1.Add Record  2.Search Record 3.Delete Record 4.DisplayRecord\n ");
		System.out.println("Choose an Option:");
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
		case 3:
			DeleteRecord dr=new DeleteRecord();
			dr.deleteRecord();
			break;
		case 4:
			DisplayRecord dis=new DisplayRecord();
			dis.display();
			break;
			default:
				System.out.println("Invalid Selection!!");
		}
		System.out.println("Do you want to continue? YES or No \n");
		op=sc.next();
		}
		while(op.equals("yes"));
		sc.close();
	}
	
}
