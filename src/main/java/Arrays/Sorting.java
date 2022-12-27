package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    static int[] selectionSort(int[] arr){
        int temp;
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                if (i != j){

                    if (arr[j]>arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter arrays length");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int i =0;
        while (i<length){
            System.out.println("Please enter " + (i+1) + ". Element");
            int num = scan.nextInt();
            arr[i++] = num;
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
