package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TransposeMatris {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };

        int[][] transpose = new int[matris[0].length][matris.length];
        for (int i=0; i<matris.length;i++){
            for (int j=0; j<matris[0].length;j++){

                transpose[j][i] = matris[i][j];

            }

        }


        for (int[] row: transpose){
            System.out.println(Arrays.toString(row));
        }

        }
    }



