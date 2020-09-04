package com.atmecs.collections;

import java.util.*;

public class DeleteRecord extends AddRecord
{
	void deleteRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the record you want to delete:\n");
		int eid = sc.nextInt();
		if(map.containsKey(eid))
		{
		map.remove(id);
		System.out.println("Record deleted...");
		}
	}
}
