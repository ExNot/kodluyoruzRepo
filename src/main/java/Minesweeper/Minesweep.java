package Minesweeper;

import java.util.Arrays;
import java.util.Scanner;

public class Minesweep {
    int rowRange;
    int columRange;
    Minesweep(int rowRange,int columRange){
        this.rowRange = rowRange;
        this.columRange = columRange;
    }

    static String[][] createBlank(String[][] blank){

        for (int i =0; i<blank.length; i++){
            for (int j=0; j<blank[i].length; j++){
                blank[i][j] = "-";
            }
        }

        return blank;
    }
    static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    }
    static String[][] plantMines(int mineNum, String[][] blank){
        int i =0;
        String[][] map = new String[blank.length][blank[0].length];
        for (int j=0; j<blank.length; j++){
            map[j] = Arrays.copyOf(blank[i], blank[i].length);
        }
            while (i<mineNum){
            int mineLocationRow = (int) (Math.random() * map.length);
            int mineLocationColum = (int) (Math.random() * map[0].length);
            if (map[mineLocationRow][mineLocationColum] != "*"){
                map[mineLocationRow][mineLocationColum] = "*";
                i++;
            }
        }
        return map;
    }

        void run(){
        Scanner scan = new Scanner(System.in);
        String[][] blank = new String[this.rowRange][this.columRange];
        int mineNum =(this.columRange*this.rowRange/4);
        blank = createBlank(blank);
        String[][] map = plantMines(mineNum,blank);

        printField(map);
        printField(blank);

        int winCounter=0;
        while (true){
            System.out.println("please enter row: ");
            int row = scan.nextInt()-1;
            if (row >blank.length|| row < 0){
                System.out.println("out of boundries!!");
                continue;
            }
            System.out.println("please enter colum: ");
            int colum = scan.nextInt()-1;
            if (colum>blank[0].length || colum<0){
                System.out.println("out of boundries!!");
                continue;
            }
            if (map[row][colum] == "*"){
                System.out.println("GAME OVER!!!");
                printField(map);
                break;
            }
            else if(blank[row][colum] != "-"){
                System.out.println("You have already search that field!");
                printField(blank);
                continue;
            }

            else if (map[row][colum] == "-"){
                int counter=0;
                for (int i =-1; i<=1; i++){
                    for (int j=-1; j<=1; j++){

                        if (row+i<blank.length && row+i>=0 && colum+j<blank[0].length && colum+j>=0 && map[i+row][j+colum] == "*" ) {
                            counter++;
                        }
                    }
                }
                blank[row][colum] = String.valueOf(counter);
                printField(blank);
                winCounter++;
            }
            else {
                System.out.println("ERROR!!");
            }
            if (blank.length*blank[0].length-winCounter == mineNum){
                System.out.println("CONGRATULATIONS YOU WIN!!");
                break;
            }
        }
    }
}
