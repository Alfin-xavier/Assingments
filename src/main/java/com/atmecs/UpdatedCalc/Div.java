package com.atmecs.UpdatedCalc;

import java.util.Scanner;

public class Div extends Mul
{
	void div() 
	{
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		double a[]=new double[n];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
		}
		double sum=a[0];
		for(j=1;j<n;j++)
		{
			sum=sum/a[j];
		}
			System.out.println("Division of the Numbers:" + sum);
	}
}
