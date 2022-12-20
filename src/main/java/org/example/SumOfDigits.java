package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num: ");
        int result = 0, tn, num = scan.nextInt();
        while (num != 0){
            tn = num%10;
            result += tn;
            num /=10;
        }
        System.out.println("Som of digits is: " + result);
    }
}
