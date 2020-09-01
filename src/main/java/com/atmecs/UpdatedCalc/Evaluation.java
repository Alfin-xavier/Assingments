package com.atmecs.updatedcalc;

public class Evaluation
{
	public static void main(String[] args)
	{
		int i;
		char ch=0;
		String exp="2+5*4-6/3";
		System.out.println(exp.substring(1));
		System.out.println(exp.substring(3));
		System.out.println(exp.substring(5));
		System.out.println(exp.substring(7));
		for(i=0;i<exp.length();i++)
		ch = exp.charAt(i);
		switch(ch)
		{
		case '+':
			String st=exp.substring(0)+exp.substring(2);
			break;
		case '-':
			break;
		case '*':
			break;
		case '/':
			break;
		default:
			String val=exp.valueOf(ch);
			System.out.println(val);
		}
	}
	
}
