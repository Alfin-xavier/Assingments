package com.atmecs.updatedcalc;

public class NegativeException extends Exception {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Starting error message");
		}
		catch(Exception e)
		{
			System.out.println("User entered the negative input:"+e);
		}
	}

}
