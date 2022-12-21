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
        int k;
        for (k = n1; k>=1; k--){

            if (n1 %k ==0 && n2 %k == 0) {
                System.out.println("Gcd is: " + k);
                break;
            }
        }
        System.out.println("Lcm is: " + n11*n22/k );
    }
}
