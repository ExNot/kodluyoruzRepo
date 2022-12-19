package org.example;

import java.util.Scanner;

public class PowerWithLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num: ");
        int num1 = scan.nextInt(), result=1;
        System.out.println("Please enter second num: ");
        for (int num2 = scan.nextInt(); num2>0; num2--){
        result *= num1;
        }
        System.out.println("Power of numbers are: " + result);
    }
}
