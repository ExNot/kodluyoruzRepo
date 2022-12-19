package org.example;

import java.util.Scanner;
public class SumWhile {
    public static void main(String[] args) {
        int sum = 0, num;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please enter num");
            num = scan.nextInt();
            if (num%2 == 0 && num%4 == 0){
            sum += num;
                System.out.println(num);
            }
        }
        while (num %2 == 0);
        System.out.println("sum is:" + sum);
    }
}
