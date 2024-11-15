package Exceptions;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        try{
            System.out.println(10 / num);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You cannot divide by zero");
        }

        int number = Integer.parseInt(null); //.NumberFormatException
        System.out.println(number);

        int[] numbers = new int[5];
        System.out.println(numbers[5]);// .ArrayIndexOutOfBoundsException
    }
}
