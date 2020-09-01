package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws NegativeException
	{
		
		Scanner scr=new Scanner(System.in);
		int opt;
		String op;
		
		do
		{
			System.out.println("\t\tArithmetic Calculations \n");	
			System.out.println("1. Addition  2.Subtraction  3.Multiplication  4.Division  5.Evaluate An Expression\n");
			System.out.println("Which operation you want to perform:");
			opt=scr.nextInt();
			
			switch(opt)
			{
			case 1:
					Addition ad=new Addition();
					ad.add();
					break;
			case 2:
					Subtraction sub=new Subtraction();
					sub.sub();
					break;
			case 3:
					Multiplication mul=new Multiplication();
					mul.mul();
					break;
			case 4:
					Division div=new Division();
					div.div();
					break;
			case 5: 
					Expression exp=new Expression();
					exp.evaluate();
					break;
			default: 
				System.out.println("invalid Selection!!");
			}
			System.out.println("Do you want to continue the process? YES or No");
			op=scr.next();
			
		}while(op.equals("yes"));
		scr.close();
	
			
	}

}
