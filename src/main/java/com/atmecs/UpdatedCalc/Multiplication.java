package com.atmecs.updatedcalc;

import java.util.*;

public class Multiplication extends Subtraction
{
	void mul()
	{
		try
		{
		Scanner scr = new Scanner(System.in);
		int n,sum=1,i;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
			sum=sum*a[i];
		}
		System.out.println("Multiplication of the Numbers:" + sum);
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Exception found cause of the mismatched input "+ie+"\n");
		}
		finally
		{
			System.out.println("Give inputs as per the type..\n");
		}
	}
}
