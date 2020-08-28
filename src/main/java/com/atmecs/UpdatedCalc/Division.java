package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Division extends Multiplication
{
	void div() 
	{
		try
		{
		Scanner scr = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
		}
		int sum=a[0];
		for(j=1;j<n;j++)
		{
			sum=sum/a[j];
		}
			System.out.println("Division of the Numbers:" + sum+"\n");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("The number can't divided by zero "+ae+"\n");
		}
		finally
		{
			System.out.println("Tip: Don't give zero as divisor!!\n");
		}
	}
	}

