package com.atmecs.SimpleCalc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int opt;
		String op;
		Division d=new Division();
		do
		{
			System.out.println("** Arithmetic Calculations **");	
			System.out.println("1. Addition  2.Subtraction  3.Multiplication  4.Division");
			System.out.println("Which operation you want to perform:");
			opt=scr.nextInt();
			
			switch(opt)
			{
			case 1:
					
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
			
		}while(opt<5);
		
			
	}

}
