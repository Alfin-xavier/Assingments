package com.atmecs.collectionsclass;

import java.util.*;

public class DisplayRecord extends addrec
{
	public void dispRecords()
	{
		 Set<Map.Entry<String, List<String>>> st = m.entrySet();
		for (Map.Entry<String, List<String>> me : st) { 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());
		}
	}
}