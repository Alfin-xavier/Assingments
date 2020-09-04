package com.atmecs.employee_records;

import java.util.*;

public class DeleteRecord extends AddRecord
{
	void deleteRecord()
	{
		System.out.println("Enter the id of the record you want to delete..");
		String eid = sc.next();
		
			if(map.containsKey(eid))
			{
				map.remove(id);
			}
		
		System.out.println("Record deleted...");
	}
}
