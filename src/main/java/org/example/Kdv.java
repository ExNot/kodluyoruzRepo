package org.example;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double kdv1=0.18, kdv2=0.08, price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the price");
        price = scan.nextDouble();

        if (price<=1000) System.out.println("Total price is: " + (price+ price*kdv1));
        else System.out.println("Total price is: " + (price+ price*kdv2));


    }
}
