package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int nums = scan.nextInt();
        int sum = 0;
        int j =0 , k=0;
        for (int i = 0; i<nums; i++){
            k= sum;
            sum = j+k;
            j = k;
            if (sum == 0) j++;
            System.out.print(sum + " ");
        }
    }
}
