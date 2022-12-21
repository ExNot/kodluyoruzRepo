package org.example;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Please enter a num, for exit enter 0!");
            int sum=0;
            num = scan.nextInt();
            for (int k =(num/2)+1; k>0; k--){
                if(num%k == 0) sum+=k;
            }
            if (sum == num) System.out.println(num + "is perfect num!");
            else System.out.println(num + " is not a perfect num!");
        }while (num != 0);
    }
}
