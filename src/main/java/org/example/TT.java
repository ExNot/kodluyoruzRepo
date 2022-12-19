package org.example;

import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number!");
        int num = scan.nextInt();
        int sum =0;
        int counter=0;
        for (int a = 1; a-1 != num; ++a){

            if (a%12 == 0){
                sum+=a;
                counter++;
                System.out.println(a);
            }

        }
        System.out.println("avarage is: " + sum/counter);
    }
}
