package org.example;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much will you enter: ");
        int greatest= Integer.MIN_VALUE, lowest =Integer.MAX_VALUE, counter = 0;
        for (int nums = scan.nextInt(); nums >0; nums--){
            counter++;
            System.out.println("Please enter " + counter + ". num");
            int inp = scan.nextInt();
            if (inp>greatest) greatest = inp;
            if (inp<lowest) lowest = inp;
        }
        System.out.println("Greatest num is: " + greatest + "\nLowest num is: " + lowest);
    }
}
