package com.atmecs.collections;

import java.util.*;

public class DisplayRecord extends AddRecord
{
	public void display()
	{
		 Set<Map.Entry<Integer, Object>> set = map.entrySet();
			for (Map.Entry entry : set)
			{ 
				System.out.println("Employee Details\n");
				System.out.print(entry.getKey() + " " + entry.getValue()); 
				
			}
	}
}
