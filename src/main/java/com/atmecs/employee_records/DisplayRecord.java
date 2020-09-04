package com.atmecs.employee_records;

import java.util.*;
import java.util.Map.Entry;

public class DisplayRecord extends AddRecord
{
	public void display()
	{
		 Set<Entry<Integer, Object>> st = map.entrySet();
			for (Entry<Integer, Object> me : st) 
			{ 
				System.out.print(me.getKey() + ":"); 
				System.out.println(me.getValue());
			}
	}
}
