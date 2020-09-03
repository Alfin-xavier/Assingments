package com.atmecs.updatedcalc;


import java.util.Scanner;

public class Evaluation 
{
	 void evaluation()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your Expression");
		String expression1 = sc.next();
		String[] operands = expression1.split("[\\+\\-\\*\\/]");
		String[] operators = expression1.split("\\d+");
		int result = 0;
		for (int i= 0; i < operators.length; i++) 
		{
			int number = Integer.parseInt(operands[i]);
			if (operators[i].equals("+")) 
			{
				result = result + number;
			} 
			else if (operators[i].equals("-")) 
			{
				result = result - number;
			} 
			else if (operators[i].equals("*")) 
			{
				result = result * number;
			} 
			else if (operators[i].equals("/"))
			{
				result = result / number;
			} 
			else
			{
				result = result + number;
			}
		}
		System.out.println("Result = " + result+"\n");
		}
		catch(Exception ex)
		{
			System.out.println("user tried to convert a string into integer "+ex+"\n");
		}
		finally
		{
			System.out.println("Exception might be thrown when you try to convert a String into a number.\n");
		}
	}

}