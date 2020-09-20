package com.atmecs.updatedcalc;

import java.util.*;
import java.util.Scanner;

public class Addition
{
	Scanner scr = new Scanner(System.in);
	public void add() throws NegativeException 
	{
		
		int quant,sum=0,i,array;
		List<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter the quantity:");
		quant=scr.nextInt();
		System.out.println("Enter the number:");
		for(i=0;i<quant;i++)
		{
		 array=scr.nextInt();
		 arr.add(array);
     		if(arr.get(i)<0)
			{
				throw new NegativeException("Exception found cause of the negative input:"+arr);
			}
			else
				sum=sum+arr.get(i);
		}
		System.out.println("Addition of the Numbers:" + sum+"\n");
	}
	
}
