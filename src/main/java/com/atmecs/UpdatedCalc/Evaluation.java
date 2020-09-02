package com.atmecs.updatedcalc;

import java.util.Scanner;

public class Evaluation
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter an expression to compute: ");
        String userInput = "3+4*5-4/2";
        int count=userInput.indexOf(userInput);
        String ch[] = userInput.split(" ");
        switch (ch[count].charAt(0)) {
            case '+':
                result = Integer.parseInt(ch[0])
                        + Integer.parseInt(ch[2]);
                break;
            case '-':
                result = Integer.parseInt(ch[0])
                        - Integer.parseInt(ch[2]);
                break;
            case '*':
                result = Integer.parseInt(ch[0])
                        * Integer.parseInt(ch[2]);
                break;
            case '/':
                result = Integer.parseInt(ch[0])
                        / Integer.parseInt(ch[2]);
        }

        // Display result
        System.out.println(ch[0] + ' ' + ch[1] + ' ' + ch[2] + " = " + result);
    }

}