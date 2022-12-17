package org.example;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height(meter)");
        double h = scan.nextDouble();
        System.out.println("Please enter your mass(kg)");
        double mass = scan.nextDouble();
        double index = mass/(h*h);
        System.out.println("Your body mass index is: " + index);
    }
}
