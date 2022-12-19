package org.example;

import java.util.Scanner;

public class Sorting3num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Please enter the first num(a): ");
        a = scan.nextInt();
        System.out.println("Please enter the second num(b): ");
        b = scan.nextInt();
        System.out.println("Please enter the third num(c): ");
        c = scan.nextInt();
        if (a>b && a>c){
            if (b>c) System.out.println("a>b>c");
            else System.out.println("a>c>b");
        }
        else if(b>a && b>c){

            if (a>c) System.out.println("b>a>c");
            else System.out.println("b>c>a");

        }
        else
            if (a>b) System.out.println("c>a>b");
            else System.out.println("c>b>a");
    }
}
