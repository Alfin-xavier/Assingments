package com.atmecs.collectionsclass;

import java.util.*;

public class AddRecord extends GettingInputs
{
	Map<Integer, List<String>> m= new HashMap<Integer, List<String>>(); 
	List<String> list = new ArrayList<String>();
	
	public void add()
	{
		System.out.println("Enter id :");
		int id = sc.nextInt();
		System.out.println("Enter name :");
		list.add(sc.next());
		System.out.println("Enter department :");
		list.add(sc.next());
		System.out.println("Enter designation :");
		list.add(sc.next());
		System.out.println("Enter salary :");
		list.add(sc.next());
		m.put(id, list);

	}

}