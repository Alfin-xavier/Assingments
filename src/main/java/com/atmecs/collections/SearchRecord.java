package com.atmecs.collections;

import java.util.*;
public class SearchRecord extends AddRecord
{
	public	void search()
	{
		
		System.out.println("Enter employee id to search an employee:");
		int eid=sc.nextInt();
		if(map.containsKey(eid))
		{
			List<Object> list = (List<Object>) map.get(id);
			System.out.println(list);
		}
		else
		{
			System.out.println("Record not found!!");
		}
		
	}
	
}
