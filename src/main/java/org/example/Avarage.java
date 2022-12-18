package org.example;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        int math, physics,turkish, chemistry,music,sum=0;
        double avg,counter=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Math note");
        math = scan.nextInt();
        System.out.println("Please enter your Physics note");
        physics = scan.nextInt();
        System.out.println("Please enter your Turkish note");
        turkish = scan.nextInt();
        System.out.println("Please enter your Chemistry note");
        chemistry = scan.nextInt();
        System.out.println("Please enter your Music note");
        music = scan.nextInt();
        if (math>=0 && math<=100){
            sum+=math;
            counter++;
        }
        if (physics>=0 && physics<=100){
            sum+=physics;
            counter++;
        }
        if (turkish>=0 && turkish<=100){
            sum+=turkish;
            counter++;
        }
        if (chemistry>=0 && chemistry<=100){
            sum+=chemistry;
            counter++;
        }
        if (music>=0 && music<=100){
            sum+=music;
            ++counter;
        }
        avg = sum/counter;
        if (avg >=55) System.out.println("You passed!");
        else System.out.println("You failed!");
        System.out.println("Your avg is: " + avg);
    }
}
