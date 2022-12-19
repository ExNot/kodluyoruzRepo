package org.example;

import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day,month;
        System.out.println("Please enter your birth day: ");
        day = scan.nextInt();
        System.out.println("Please enter your birth month: ");
        month = scan.nextInt();

        if (month ==3){
            if (day >=21 && day<=31) System.out.println("Aries!");
            else if (day<21 && day>=1) {
                System.out.println("Pisces!");
            }
            else System.out.println("You entered invalid day");

        }
        else if(month == 4){
            if (day >=21 && day <=30) System.out.println("Taurus");
            else if (day<21 && day>=1) {
                System.out.println("Aries");
            }
            else System.out.println("You entered invalid day!");
        }
        else if (month == 5){
            if (day >= 22 && day <=31) System.out.println("Gemini");
            else if (day <22 && day >=1) {
                System.out.println("Taurus");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 6) {
            if (day >=22 && day <=30) System.out.println("Cancer");
            else if (day >=1 && day <22) {
                System.out.println("Gemini");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 7) {
            if (day>=23 && day <=31) System.out.println("Leo");
            else if (day <23 && day >=1) {
            System.out.println("Cancer");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 8) {
            if (day>=23 && day <= 31) System.out.println("You are virgo");
            else if (day <23 && day >= 1) {
                System.out.println("Leo");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 9) {
            if (day >=23 && day <=30) System.out.println("Libra");
            else if (day >= 1 && day <23) {
                System.out.println("Virgo");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 10) {
            if (day>=23 && day <=31) System.out.println("Scorpio");
            else if (day>=1 && day <23) {
                System.out.println("libra");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month ==11) {
            if (day>=22 && day<=30) System.out.println("Sagittarius");
            else if (day>=1 && day <22) {
                System.out.println("Scorpio");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 12) {
            if (day >= 22 && day <31) System.out.println("Capricorn");
            else if (day >=1 && day <22) {
                System.out.println("Sagittarius");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month ==1) {
            if (day>=21 && day <31) System.out.println("Aquarius");
            else if (day>=1 && day <21) {
                System.out.println("Capricorn");
            }
            else System.out.println("You entered invalid day");
        }
        else if (month == 2) {
            if (day>= 20 && day <=30) System.out.println("Pisces");
            else if (day >=1 && day<20) {
                System.out.println("Aquarius");
            }
            else System.out.println("You entered invalid day");
        }


    }

}
