package org.example;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series: " );
        int n = mec.nextInt();
        int counter = 0;

        int i=0,l=1;
        int total=0;
        System.out.println(n+" Element Fibonacci Series: ");
        while(counter<=n){
            total=i+l;
            System.out.print(i+" ");
            i=l;
            l=total;
            counter++;
        }
    }
}


