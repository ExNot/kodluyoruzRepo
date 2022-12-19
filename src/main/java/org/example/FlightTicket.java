package org.example;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double pricePerDistance = 0.1, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the distance");
        int distance = scan.nextInt();
        System.out.println("Please enter the trip type(One direction->1  round-trip=2): ");
        int tripType = scan.nextInt();
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        switch (tripType){
            case 1:
                if (age <= 12 && age>=1){
                    total = pricePerDistance*distance*0.5;
                    System.out.println("Total amount is: " + total);
                }
                else if (age >12 && age <= 24){
                    total = pricePerDistance*distance*0.9;
                    System.out.println("Total amount is: " + total);
                }
                else if (age >= 65){
                    total = pricePerDistance*distance*0.7;
                    System.out.println("Total amount is: " + total);
                }
                else {
                    total = pricePerDistance*distance;
                    System.out.println("Total amount is: " + total);
                }

                break;
            case 2:
                if (age <= 12 && age>=1){
                    total = pricePerDistance*distance*0.5*0.8*2;
                    System.out.println("Total amount is: " + total);
                }
                else if (age >12 && age <= 24){
                    total = pricePerDistance*distance*0.9*0.8*2;
                    System.out.println("Total amount is: " + total);
                }
                else if (age >= 65){
                    total = pricePerDistance*distance*0.7*0.8*2;
                    System.out.println("Total amount is: " + total);
                }
                else {
                    total = pricePerDistance*distance*2*0.8;
                    System.out.println("Total amount is: " + total);
                }

                break;
            default:
                System.out.println("Wrong entry!");
        }


    }
}
