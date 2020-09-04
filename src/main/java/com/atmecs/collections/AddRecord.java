package com.atmecs.collections;

import java.util.*;

public class AddRecord extends GettingInputs
{
	
	int emp,index,id;
	
	HashMap<Integer,Object> map=new HashMap<Integer,Object>();
	
	Scanner sc=new Scanner(System.in);
	void addRecord()
	{
		System.out.println("Enter the number of employee you want to add:");
		emp=sc.nextInt();
		
		for(index=0;index<emp;index++) 
		{
			System.out.println("Enter employee id:");
			id=sc.nextInt();
			
			System.out.println("Enter emplyoee name:");
			name=sc.next();
			map.put(id, getname());
			
			System.out.println("Enter employee department:");
			dept_name=sc.next();
			map.put(id, getdept_name());
			
			System.out.println("Enter employee designation:");
			designation=sc.next();
			map.put(id, getdesignation());
			
			System.out.println("Enter employee salary:");
			salary=sc.nextInt();
			map.put(id,getsalary());

		}
		
	}
}
