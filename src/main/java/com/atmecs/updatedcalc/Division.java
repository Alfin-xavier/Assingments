package com.atmecs.updatedcalc;

import java.util.*;

public class Division 
{
	void div() 
	{
		Scanner scr = new Scanner(System.in);
		try
		{
			
			int n,i,j,list;
			List<Integer> ls=new ArrayList<Integer>();
			System.out.println("Enter the quantity:");
			n=scr.nextInt();
			System.out.println("Enter the number:");
			for(i=0;i<n;i++)
			{
				list=scr.nextInt();
				ls.add(list);
			}
			int sum=ls.get(0);
			for(j=1;j<n;j++)
			{
				sum=sum/ls.get(j);
			}
				System.out.println("Division of the Numbers:" + sum+"\n");
			
		}
		catch(Exception ex)
		{
			System.out.println("User entered divisor as zero "+ex+"\n");
		}
		finally
		{
			System.out.println("A number can't divided by zero..\n");
		}
	}
}


