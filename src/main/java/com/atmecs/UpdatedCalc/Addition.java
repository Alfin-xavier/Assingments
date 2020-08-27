package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Addition
{
	public void add() throws NegativeException
	{
		Scanner scr = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
			if(a[i]<0)
			{
				throw new NegativeException();
			}
			else
				sum=sum+a[i];
		}
		System.out.println("Addition of the Numbers:" + sum);
	}
	
}
