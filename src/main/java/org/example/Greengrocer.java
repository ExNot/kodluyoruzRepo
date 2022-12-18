package org.example;

import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        double pear=2.14, apple=3.67, tomato=1.11, banana=0.95, eggplant=5.00;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pear in kilogram?");
        double pearKilo = scan.nextDouble();

        System.out.println("How many apple in kilogram?");
        double appleKilo = scan.nextDouble();

        System.out.println("How many tomato in kilogram?");
        double tomatoKilo = scan.nextDouble();

        System.out.println("How many banana in kilogram?");
        double bananaKilo = scan.nextDouble();

        System.out.println("How many eggplant in kilogram?");
        double eggplantKilo = scan.nextDouble();

        System.out.println("Total amount is: " + (pear*pearKilo+appleKilo*apple+ tomatoKilo* tomato+ bananaKilo*banana+ eggplantKilo*eggplant));

    }

}