package com.atmecs.UpdatedCalc;

import java.util.Scanner;

public class Mul extends Sub
{
	void mul()
	{
		Scanner scr = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[n];
		for(i=1;i<=n;i++)
		{
			a[i]=scr.nextInt();
			sum=sum*a[i];
		}
		System.out.println("Addition of the Numbers:" + sum);
	}
}
