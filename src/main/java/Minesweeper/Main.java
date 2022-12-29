package Minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter range of rows: ");
        int rowRange = scan.nextInt();
        System.out.println("Please enter range of colums: ");
        int columRange = scan.nextInt();
        Minesweep ms = new Minesweep(rowRange,columRange);
        ms.run();
    }

}
