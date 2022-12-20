package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num,pow = 0, base, inp, inp1;
        System.out.println("Please enter number: ");
        inp = scan.nextInt();
        inp1 = inp;
        num =inp1;
        while (inp1 != 0){
            inp1 /=10;
            pow++;
        }
        int Tnum=1,fResult=0;

        while (inp !=0){
            int result =1;
            Tnum = inp %10;
            for (int i = 1; i<=pow; i++){
                result = result*Tnum;
            }
            inp/=10;
            fResult += result;
        }
        if(fResult == num) System.out.println(num + " is a Armstrong number!");
        else System.out.println(num + " is not a Armstrong number!");

    }
}
