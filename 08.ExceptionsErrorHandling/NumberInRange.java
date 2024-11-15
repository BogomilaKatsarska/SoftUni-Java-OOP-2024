package Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        int start = range[0];
        int end = range[1];

        System.out.printf("Range: [%d...%d]\n", start, end);

        while (true){
            String input = scanner.nextLine();
            try{
                int number = Integer.parseInt(input);
                if (number < start && number > end){
                    System.out.println("Invalid number: " + input);
                } else {
                    System.out.println("Valid number: " + input);
                    break;
                }
            } catch (NumberFormatException exception){
                System.out.println("Invalid number: " + input);
            }
        }
    }
}
