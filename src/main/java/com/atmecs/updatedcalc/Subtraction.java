package com.atmecs.updatedcalc;

import java.util.*;

public class Subtraction 
{
	void sub()
	{
		Scanner scr = new Scanner(System.in);
		try
		{
		
		int n,sum=0,i,list;
		List<Integer> ls=new LinkedList<Integer>();
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		for(i=0;i<n;i++)
		{
			list=scr.nextInt();
			ls.add(list);
		}
		
		sum=ls.size()> 0 ? ls.get(0) : 0;
		for ( i = 1; i< ls.size(); i++ ) 
		{
			sum=sum-ls.get(i);
		}
		System.out.println("Subtraction of the Numbers:" + sum+"\n");
		}
		catch(Exception ex)
		{
			System.out.println("User entered mismatched type of input "+ex+"\n");
		}
		finally
		{
			System.out.println("Exception might be thrown when enter mismatched type..\n");
		}
	}

}
