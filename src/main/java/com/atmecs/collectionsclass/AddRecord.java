package com.atmecs.collectionsclass;

import java.util.*;

public class AddRecord extends GettingInputs
{
	Map<Object, List<String>> m= new HashMap<Object, List<String>>(); 
	List<String> list = new ArrayList<String>();
	
	public void add()
	{
		System.out.println("Enter id :");
		int id = sc.nextInt();
		System.out.println("Enter name :");
		name=sc.next();
		list.add(getname());
		System.out.println("Enter department :");
		dept_name=sc.next();
		list.add(getdept_name());
		System.out.println("Enter designation :");
		designation=sc.next();
		list.add(getdesignation());
		System.out.println("Enter salary :");
		salary=sc.next();
		list.add(getsalary());
		m.put(id, list);

	}

}