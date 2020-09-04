package com.atmecs.collections;

import java.util.*;
public class SearchRecord extends AddRecord
{
	public	void search()
	{
		
		System.out.println("Enter id to search an employee:");
		int eid=sc.nextInt();
		if(map.containsKey(eid))
		{
			map.get(id);
		}
		else
		{
			System.out.println("Record not found!!");
		}
		
	}
	
}
