package org.example;

import java.util.Scanner;

public class DiamondWithStars {

    public static void main(String[] args) {

        /*
                    *      4s 1* 4s
                   ***     3s 3* 3s
                  *****    2s 5* 2s
                 *******   1s 7* 1s
                *********     9*
                 *******       1s
                  *****        2s
                   ***         3s
                    *          4s
         */
        String out = "";
        Scanner scan = new Scanner(System.in);
        int inp;

        System.out.println("Please enter an odd num: ");
        inp = scan.nextInt();

        int input = inp;
        int input1 = inp;
        int input2 = inp;
        while (inp != 0){

            for (int i =1; i<= inp-1; i++){
                out += " ";
            }
            for (int j =0; j<= (input - inp)*2; j++ ){
                out+="*";
            }
            out+="\n";
            inp--;
        }

        while (input1!=0){

            for (int l = 0; l<=(input2-input1); l++){
                out += " ";

            }
            for (int k = 1; k<=2*(input1-1)-1; k++){

                out+= "*";

            }

            out+="\n";
            input1--;

        }

        System.out.println(out);

    }

}
