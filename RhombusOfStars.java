package Rhombus;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printStars(n);
    }

    private static void printStars(int i) {
        if (i==1){
            System.out.println("*");
            return;
        }
        //print upper part of rhombus
        for (int row = 1; row <= i ; row++) {
            printRow(row, i);
        }
        //print rhombus lower part
        for(int row = i-1; row >=1; row--) {
            printRow(row, i);
        }

    }
    private static void printRow(int row,int sizeOfEl){
        int countOfWhiteSpaces = sizeOfEl - row;
        for (int i = 1; i <=countOfWhiteSpaces ; i++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= row; star++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
