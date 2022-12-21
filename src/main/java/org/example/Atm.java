package org.example;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int right = 3, balance = 1500,n;
        String userName, password;
        System.out.println("Welcome the X bank! ");
        int price;
        while (right>0)
        {
            System.out.println("Please enter your username");
            userName = inp.nextLine();
            System.out.println("Please enter your password");
            password = inp.nextLine();
            if (userName.equals("admin") && password.equals("admin123")){
                do{
                    System.out.println("Please enter action \n 1-Deposite \n 2-Withdrow \n 3-Balance \n 4-Exit");
                    n=inp.nextInt();
                    switch (n){
                        case 1:
                            System.out.println("Please enter deposit amount!");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Your new balance: " + balance);
                            break;
                        case 2:
                            System.out.println("Please enter withdraw amount: ");
                            price = inp.nextInt();
                            if (price> balance) System.out.println("Insufficient balance!");
                            else {
                                balance -= price;
                                System.out.println("Your new balance: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;

                    }


                }while (n != 4);
                System.out.println("Hope see you soon!");
                break;
            }
            else right--;
            System.out.println("Failed! you got " + right + " right!");

        }
        if (right == 0)
        System.out.println("You failed 3 times!!!");


    }
}
