package com.atmecs.collectionsclass;

import java.util.*;
import java.util.Map.Entry;

public class DisplayRecord extends AddRecord
{
	public void dispRecords()
	{
		 Set<Entry<String, List<String>>> st = m.entrySet();
		for (Entry<String, List<String>> me : st)
		{ 
			System.out.print(me.getKey()+ ":"); 
			System.out.println(me.getValue());
		}
	}
}