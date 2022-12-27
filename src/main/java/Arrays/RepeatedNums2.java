package Arrays;

import java.util.Arrays;

public class RepeatedNums2 {
    static boolean isRepeated(int[] arr,int[]repNums, int k){

        for (int i=0; i<=k; i++){
            if (arr[k] == repNums[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int[] arr = {10,20,20,10,10,20,5,20};
        int[] rep = new int[arr.length];
        int[] repNums = new int[arr.length];
        int k=-1;
        for (int i =0; i<arr.length; i++){
            int counter =1;
            k++;
            for (int j =0; j<arr.length; j++){

                if (i!=j){

                    if (arr[i] == arr[j]){
                        ++counter;
                    }
                }
            }
            if (isRepeated(arr, repNums, k)){
                rep[k]=counter;
                repNums[k] = arr[i];
            }

        }

        for (int i=0; i<arr.length;i++){
            if (repNums[i] !=0){
                System.out.println(repNums[i] + " is repeated " + rep[i] + " times.");
            }
        }


    }
}
