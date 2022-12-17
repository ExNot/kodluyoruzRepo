package org.example;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        int r = scan.nextInt();
        System.out.println("Please enter the measure of the central angle");
        int a = scan.nextInt();
        System.out.println("Area of the circle is: " + (3.14*(r*r)*a/360));

    }
}
