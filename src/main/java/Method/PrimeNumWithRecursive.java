package Method;

import java.util.Scanner;

public class PrimeNumWithRecursive {

    static boolean primeCheck(double num, double i){

        if (num == 0) return false;
        if (i < (num/2)+1){
            if (num % i == 0) return false;
            i++;
            return primeCheck(num,i);
        }
      return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num =1;

        do {
            System.out.println("Please enter a num");
            num = scan.nextInt();
            boolean isPrime = primeCheck(num, 2);
            if (num == 0) System.out.println("Exitting!");
            else if (isPrime) System.out.println(num + " is a prime num!");
            else System.out.println(num + " is not a prime num!");

        }while (num != 0);


    }
}
