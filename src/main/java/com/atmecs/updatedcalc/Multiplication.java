package com.atmecs.updatedcalc;

import java.util.*;

public class Multiplication
{
	void mul()
	{
		Scanner scr = new Scanner(System.in);
		try
		{
		
		int n,sum=1,i;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[3];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
			sum=sum*a[i];
		}
		System.out.println("Multiplication of the Numbers:" + sum+"\n");
		}
		catch(Exception ex)
		{
			System.out.println("Array limit exceeded "+ex+"\n");
		}
		finally
		{
			scr.close();
			System.out.println("Exception might be thrown when array limit has exceeds..\n");
		}
	}
}
