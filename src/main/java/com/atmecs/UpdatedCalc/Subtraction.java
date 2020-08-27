package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Subtraction extends Addition
{
	void sub()
	{
		try
		{
		Scanner scr = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("Enter the quantity:");
		n=scr.nextInt();
		System.out.println("Enter the number:");
		int a[]=new int[5];
		for(i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
		}
		sum=a.length > 0 ? a[0] : 0;
		for ( i = 1; i< a.length; i++ ) 
		{
			sum=sum-a[i];
		}
		System.out.println("Subtraction of the Numbers:" + sum);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Exception found the cause of array limit exceeds "+ai+"\n");
		}
		finally
		{
			System.out.println("Give the input according to the array limit!!! \n");
		}
	}

}
