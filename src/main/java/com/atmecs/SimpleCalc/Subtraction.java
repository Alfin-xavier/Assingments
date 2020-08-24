package com.atmecs.SimpleCalc;

import java.util.Scanner;

public class Subtraction extends Addition
{
void sub() {
		
		int c = a - b;
		System.out.println("Subtraction of two numbers:" + c);
	}

	void add() {
		int d;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = scr.nextInt();
		System.out.println("Enter the second number:");
		b = scr.nextInt();
		System.out.println("Enter the Third number:");
		int c = scr.nextInt();
		d = a + b + c;
		System.out.println("Addition of three numbers:" + d);
	}

}
