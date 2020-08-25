package com.atmecs.UpdatedCalc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int opt;
		String op;
		Div d=new Div();
		do
		{
			System.out.println("** Arithmetic Calculations **");	
			System.out.println("1. Addition  2.Subtraction  3.Multiplication  4.Division");
			System.out.println("Which operation you want to perform:");
			opt=scr.nextInt();
			
			switch(opt)
			{
			case 1:
					d.add();
					break;
			case 2:
					d.sub();
					break;
			case 3:
					d.mul();
					break;
			case 4:
					d.div();
					break;
			default: 
				System.out.println("invalid Selection!!");
			}
			System.out.println("Do you want to continue the process? YES or No");
			op=scr.next();
			
		}while(op.equals("yes"));
		
			
	}

}
