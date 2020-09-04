package com.atmecs.collectionsclass;

import java.util.*;

public class DisplayRecord extends AddRecord
{
	public void dispRecords()
	{
		 Set<Map.Entry<Object, List<String>>> st = m.entrySet();
		for (Map.Entry<Object, List<String>> me : st)
		{ 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());
		}
	}
}