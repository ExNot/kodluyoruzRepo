package org.example;

import java.util.Scanner;

public class PowerWithLoop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num!");
        int counter=0,pow4 = 1, pow5 = 1;
        for (int num = scan.nextInt(); num>0; num--){
            System.out.println(counter + " Power of 4 is: " + pow4);
            System.out.println(counter + " Power of 5 is :" + pow5);
            pow4 *= 4;
            pow5 *= 5;
            counter++;
        }
    }
}
