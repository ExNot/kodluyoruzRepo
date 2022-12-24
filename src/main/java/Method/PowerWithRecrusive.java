package Method;

import java.util.Scanner;

public class PowerWithRecrusive {
    static int power(int base, int pow,int result){

        while (pow != 0){
            result *= base;
            pow--;
            power(base,pow,result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter base:");
        int base = scan.nextInt();
        System.out.println("Please enter power: ");
        int pow = scan.nextInt();
        int result = power(base,pow,1);
        System.out.println("Power of numbers is: " + result);
    }

}
