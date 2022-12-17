package org.example;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first edge: ");
        int e1 = scan.nextInt();
        System.out.println("Please enter second edge: ");
        int e2 = scan.nextInt();
        System.out.println("Please enter third edge: ");
        int e3 = scan.nextInt();
        double u = (e1+e2+e3)/2.0f;
        double area = Math.sqrt(u*(u-e1)*(u-e2)*(u-e3));
        System.out.println("The area of trienglee is:" + area);
    }
}
