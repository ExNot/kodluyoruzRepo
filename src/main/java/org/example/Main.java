package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int math,physics,chemistry,english,history,music;
         Scanner scan = new Scanner(System.in);

        System.out.println("Your Math Degree: ");
        math = scan.nextInt();

        System.out.println("Your Physics Grade: ");
        physics = scan.nextInt();

        System.out.println("Your Chemistry Grade: ");
        chemistry = scan.nextInt();

        System.out.println("Your English Grade: ");
        english = scan.nextInt();

        System.out.println("Your History Grade: ");
        history = scan.nextInt();

        System.out.println("Your Music Grade: ");
        music = scan.nextInt();

        int sum = math+physics+chemistry+english+history+music;
        double avg = sum/6;
        System.out.println("Your avg: "+avg);

        String passControl = avg>=50 ? "Passed" : "Failed";
        System.out.println(passControl);




    }

}