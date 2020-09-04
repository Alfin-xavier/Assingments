package com.atmecs.employee_records;

import java.util.*;
public class SearchRecord extends AddRecord
{
	//@SuppressWarnings("unchecked")
	public	void search()
	{
		System.out.println("Enter the id of the record you want to search..");
		String eid = sc.next();
		if(map.containsKey(eid))
		{
			List<Object> list= (List<Object>) map.get(id);
			System.out.println(list);

		}

		else
		{
			System.out.println("Record not found!!");
		}
		
	}
	
}
