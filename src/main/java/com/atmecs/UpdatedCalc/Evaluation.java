package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Evaluation 
{
	public void evaluation()
	{
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression: ");
		String exp = sc.next();
		String[] operands = exp.split("[\\+\\-\\*\\/]");
		String[] operators = exp.split("\\d+");
		int result = 0;
		for (int i = 0; i < operators.length; i++) 
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
		System.out.println("Result = " + result);

		sc.close();
	}
	

}