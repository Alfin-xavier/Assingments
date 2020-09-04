package com.atmecs.collectionsclass;

import java.util.*;

public class DisplayRecord extends AddRecord
{
	public void dispRecords()
	{
		 Set<Map.Entry<Integer, List<String>>> st = m.entrySet();
		for (Map.Entry<Integer, List<String>> me : st)
		{ 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());
		}
	}
}