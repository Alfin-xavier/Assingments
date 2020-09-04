package com.atmecs.employee_records;

import java.util.*;

public class AddRecord extends GettingInputs
{
	Map<Integer,Object> map=new HashMap<Integer,Object>();
	int index;
	String details;
	void addRecord()
	{
		System.out.println("Enter the number of employee you want to add:");
		int emp=sc.nextInt();
		System.out.println("Enter ID: ");
		id=sc.nextInt();
		for(index=0;index<emp;index++) 
		{
			input();
			
		}
		map.put(id,list);
		
	}
}
