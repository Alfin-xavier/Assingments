package com.atmecs.UpdatedCalc;

import java.util.Scanner;

public class Sub extends Add
{
	void sub()
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
		}
		sum=a.length > 0 ? a[0] : 0;
		for()
		{
			sum=sum-a[i];
		}
		System.out.println("Subtraction of the Numbers:" + sum);
	}
}
