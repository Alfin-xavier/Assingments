package com.atmecs.updatedcalc;

import java.util.*;

public class Multiplication
{
	void mul()
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
}
