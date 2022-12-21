package org.example;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num: ");
        int num = scan.nextInt();
        for (int i = 2; i<num+1; i++){
            boolean flag = true;
            for (int j = 2; j<(i/2)+1; j++){
                if (i%j == 0) flag = false;
            }
            if (flag == true) System.out.println(i);
        }
    }
}
