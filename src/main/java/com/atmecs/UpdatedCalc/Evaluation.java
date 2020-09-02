package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Evaluation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // The result of the operation
        int result = 0;

        // The original input
       // System.out.print("Enter an expression to compute: ");
        String userInput = "3+4*5-4/2";

        // The tokens that make up the input
        String ch[] = userInput.split(" ");
        int count=userInput.length();
        System.out.println(ch);
     }

}