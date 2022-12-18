package org.example;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usName = "admin",userName, password, newPass, pass="admin123";
        System.out.println("Please enter the username");
        userName = scan.nextLine();
        System.out.println("Please enter the password");
        password = scan.nextLine();

        if(userName.equals(usName) && password.equals(pass)){
            System.out.println("You're in!");

        }
        else{
            String s;
            System.out.println("Do you wanna change ur password?(Y)/(N)");
            s = scan.nextLine();
            switch (s){
                case "Y":
                    System.out.println("Please enter the new password!");
                    newPass = scan.nextLine();
                    if (password.equals(newPass) || newPass.equals(pass)) System.out.println("The new password can't be the ur incorret entry or used password");
                    else {
                    pass = newPass;
                    }
                break;
                case "N":
                    System.out.println("System shouting down");
                    break;
                default:
                    System.out.println("Wrong entry!");

            }
        }

    }

}
