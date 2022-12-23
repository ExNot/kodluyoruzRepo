package Method;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Calculator {

    static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        System.out.println("Sum of the nubers is: " + (num1+num2));
    }
    static void ext(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        System.out.println("Extraction of the numbers is: " + (num1-num2));
    }
    static void multi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        System.out.println("Multipication of the numbers is: " + (num1*num2));
    }
    static void dived(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        if (num2 == 0){
            System.out.println("You cant dived by 0!");
        }
        else{
            System.out.println("Dived of the numbers is: " + (num1/num2));
        }
    }
    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        int result = 1;
        for (int i =0; i<num2; i++){
            result *= num1;
        }
        System.out.println("Power of the nubers is: " + result);
    }
    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the num!");
        int num1 = scan.nextInt();
        int result = 1;
        for (int i = 1; i<=num1; i++){
            result *= i;
        }
        System.out.println("Factorial of " + num1 + " is: " + result);

    }
    static void mode(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        System.out.println("Mode of numbers is: " + (num1%num2));
    }
    static void rect(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first num!");
        int num1 = scan.nextInt();
        System.out.println("Please enter second num!");
        int num2 =scan.nextInt();
        int perimeter = (num1+num2)*2;
        int area = num1*num2;
        System.out.println("Area is: " + area + "Perimeter is: " + perimeter);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1- Summon \n 2-Extraction   \n 3- Multipication \n 4- Dived \n 5- Power \n 6- Factorial \n 7- Mode \n 8- Rectengular area and perimeter \n 0-Exit";
        System.out.println(menu);

        boolean flag = true;
        while (flag){
            System.out.println("Selection: ");
            int select = scan.nextInt();

            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    ext();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    dived();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rect();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect entry!");

            }


        }
    }
}
