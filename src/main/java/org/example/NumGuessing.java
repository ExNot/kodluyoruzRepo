package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NumGuessing {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rights = 5;
        int[] wrongGuess = new int[rights];
        boolean isRange = false;
        int num = (int)(Math.random()*100);
        System.out.println(num);
        while (rights>0){
            System.out.println("Please enter your guess(0-100): ");
            int guess = scan.nextInt();
            if (guess>100||guess<0){
                System.out.println("Please enter 0-100 range! ");
                if(isRange){
                    rights--;
                    System.out.println("Entered invalid range you got " + rights + " right!" );
                }
                else {
                    System.out.println("Becarefull:9");
                    isRange = true;
                }
                continue;
            }
            if (guess > num){
                System.out.println("Secret num is lower than " + guess);
            }
            if (guess <num){
                System.out.println("Secret num is greater than " + guess);
            }
            if (guess == num){
                System.out.println("You found it! " + num);
                break;
            }
            else{
                wrongGuess[5-rights] = guess;
                rights--;
                System.out.println("Wrong guess! you got " + rights + " right");
            }
            if (rights ==0){
                System.out.println("FAILED");
                System.out.println("The num was: " + num);
                System.out.println("You guesses are: " + Arrays.toString(wrongGuess));
            }




        }

    }
}
