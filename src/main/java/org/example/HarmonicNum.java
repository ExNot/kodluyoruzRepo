package org.example;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num: ");
        int num = scan.nextInt();
        double  result = 0;
        for (int i = 1; i<=num; i++){
            result += 1.0/i;
        }
        System.out.println(result);
    }
}
