package org.example;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int n1 = scan.nextInt();
        System.out.println("Please enter seccond num!");
        int n2 = scan.nextInt();
        int n11 = n1, n22 = n2;
        int gcd =n1;
        while (n1 != 0){
            if (n1%gcd == 0 && n2 % gcd == 0){
                System.out.println("Gcd is: " + gcd);
                break;
            }
            gcd--;
        }
        int lcm = n11*n22/gcd;
        System.out.println("Lcm is: " + lcm);
    }
}
