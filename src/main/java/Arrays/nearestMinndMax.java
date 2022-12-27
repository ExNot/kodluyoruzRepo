package Arrays;

import java.util.Scanner;

public class nearestMinndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a num");
        int input = scan.nextInt();
        int[] arr = {15,12,788,1,-1,-778,2,0};
        int less;
        int greater;
        int nearMin =Integer.MIN_VALUE;
        int nearMax = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<input){
                less =i;
                if (less>nearMin){
                    nearMin = less;
                }
            }
            if (i>input){
                greater = i;
                if (greater<nearMax){
                    nearMax = greater;
                }
            }
        }
        System.out.println("Nearest max num is: " + nearMax);
        System.out.println("Nearest min num is: " + nearMin);
    }
}
