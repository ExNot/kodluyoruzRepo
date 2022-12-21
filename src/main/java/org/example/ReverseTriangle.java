package org.example;

import java.util.Scanner;

public class ReverseTriangle {
          public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              int height = scan.nextInt();
              int step = height;
              String out = "";
              while (step != 0){

                  for (int i = height-step; i>0; i--)
                      out+= " ";

                  for (int j = 0; j<((step-1)*2)+1 ; j++)
                      out+= "*";

                  out+="\n";
                  step--;
              }
              System.out.println(out);
          }
}
