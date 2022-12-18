package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 , num2;
        double result;
        String op;
        System.out.println("Please enter the first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = scan.nextInt();
        System.out.println("Please enter the operator: ");
        op = scan.next();

        switch (op){
            case "+":
                result = num1+num2;
                System.out.println("Result:" + result);
                break;
            case "-":
                result = num1-num2;
                System.out.println("Result:" + result);
                break;
            case "*":
                result = num1*num2;
                System.out.println("Result:" + result);
                break;
            case "/":
                if (num2 == 0) System.out.println("You can't dived by 0!");
                else{
                    result = num1/num2;
                    System.out.println("Result:" + result);
                }
                break;
            default:
                System.out.println("You entered a wrong operator!");

        }

    }
}
