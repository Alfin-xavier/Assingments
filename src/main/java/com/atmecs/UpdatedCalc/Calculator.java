package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		
		Scanner scr=new Scanner(System.in);
		int opt;
		String op;
		Expression exp=new Expression();
		do
		{
			System.out.println("\t\tArithmetic Calculations \n");	
			System.out.println("1. Addition  2.Subtraction  3.Multiplication  4.Division  5.Evaluate An Expression\n");
			System.out.println("Which operation you want to perform:");
			opt=scr.nextInt();
			
			switch(opt)
			{
			case 1:
					//exp.add();
					break;
			case 2:
					exp.sub();
					break;
			case 3:
					exp.mul();
					break;
			case 4:
					exp.div();
					break;
			case 5: 
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
