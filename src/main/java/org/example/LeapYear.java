package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = scan.nextInt();
        String leapControl;
        if (year%100 == 0 && year % 400 == 0){
            leapControl = "Leap Year!";
        }
        else leapControl = "Not a leap year!";
        if (year % 4 == 0 && year %100 != 0){
            leapControl = "Leap Year";
        }
        else leapControl = "Not a leap year!";

        System.out.println(year + " is " + leapControl);
    }
}
