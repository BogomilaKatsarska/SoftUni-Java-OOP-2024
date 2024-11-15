package Exceptions;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0){
                System.out.println("Invalid");
            } else {
                double squareRootRes = Math.sqrt(input);
                System.out.printf("%.2f%n", squareRootRes);
            }

        } catch (NumberFormatException numberFormatException){
            System.out.println("Invalid number");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
