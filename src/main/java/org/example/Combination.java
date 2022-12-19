package org.example;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,n = 0, r = 0, nfak=1, rfak = 1,tfak = 1;
        double result;
        System.out.println("Please enter the first num: ");
        n = scan.nextInt();
        System.out.println("Please enter the second num: ");
        r = scan.nextInt();
        t = n-r;
        int n1 = n, r1 = r;
        if (n-r == 0) result =1;
        else {

            while (t>0){
                tfak *= t;
                t--;
            }

            while (n>0){
                nfak *= n;
                n--;
            }
            while (r>0){
                rfak *= r;
                r--;
            }
            result = nfak/(rfak*tfak);
        }
        System.out.println("The combination of nums: " + result);
    }
}
