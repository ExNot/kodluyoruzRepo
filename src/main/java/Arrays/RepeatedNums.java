package Arrays;

public class RepeatedNums {
    static boolean isHave(int[] dup, int num){

        for (int i: dup){

            if (num == i){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12,2,5,2,5,6,8,13,13,8,10,2};
        int[] dup = new int[arr.length];
        int d = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j =0; j<arr.length; j++){
                if (i!=j && arr[i] == arr[j]){
                    if (arr[i]%2 ==0){
                        if (!isHave(dup, arr[i])){
                            dup[d++] = arr[i];
                        }
                    }


                }
            }
        }
        for (int i: dup){
            if (i!=0)
            System.out.println(i);
        }
    }
}
