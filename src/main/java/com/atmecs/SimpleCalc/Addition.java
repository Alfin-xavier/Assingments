package com.atmecs.SimpleCalc;

import java.util.Scanner;

public class Addition
{
		int a, b;

		void add() 
		{
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter the first number:");
			a = scr.nextInt();
			System.out.println("Enter the second number:");
			b = scr.nextInt();
			int c = a + b;
			System.out.println("Addition of Two Numbers:" + c);
		}

}
