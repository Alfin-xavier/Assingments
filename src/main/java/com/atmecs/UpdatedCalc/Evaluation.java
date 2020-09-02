package com.atmecs.updatedcalc;


import java.util.Scanner;

public class Evaluation {

	public void evaluation() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your Expression");
		String expression1 = sc.next();
		String[] operands = expression1.split("[\\+\\-\\*\\/]");
		String[] operators = expression1.split("\\d+");
		int result = 0;
		for (int index = 0; index < operators.length; index++) {
			int number = Integer.parseInt(operands[index]);
			if (operators[index].equals("+")) {
				result = result + number;
			} else if (operators[index].equals("-")) {
				result = result - number;
			} else if (operators[index].equals("*")) {
				result = result * number;
			} else if (operators[index].equals("/")) {
				result = result / number;
			} else {
				result = result + number;
			}
		}
		System.out.println("Result = " + result);

		sc.close();
	}

}