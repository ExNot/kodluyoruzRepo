package org.example;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        int year = scan.nextInt();
        int mod = year%12;
        String zodiac;
        switch (mod){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Cockerel");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Worng entry!");

        }
    }
}
