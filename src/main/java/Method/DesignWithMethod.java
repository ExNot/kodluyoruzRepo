package Method;

import java.util.Scanner;

public class DesignWithMethod {

    static int design(int num, int tempNum, int validate, String out){

        if (num >0){
            out = out +num + " ";
            num -= 5;
            return design(num, tempNum, validate, out);

        }
        if (num<=0 && num !=-20){
            tempNum = num;
            num = -20;
        }

        if (tempNum <= validate){
            out = out + tempNum + " ";
            tempNum += 5;
            return design(num, tempNum, validate, out);
        }
        System.out.println(out);
    return 0;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter num: ");
        int num = scan.nextInt();
        int validate = num;
        int tempNum = num;
        String out = "Out is: ";
        design(num, tempNum, validate, out);

    }
}
