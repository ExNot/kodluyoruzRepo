package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ActivityFromTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;
        System.out.println("Please enter the tempreture");
        temp = scan.nextInt();
        if (temp <= 5) System.out.println("You can ski");
        if (temp>5 && temp<= 15) System.out.println("You can go to cinema");
        if (temp>15 && temp<= 25) System.out.println("You can go to picnic");
        if (temp>25) System.out.println("You can swim");
    }
}
