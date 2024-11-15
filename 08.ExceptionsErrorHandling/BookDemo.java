package Exceptions;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String authorName = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        try{
            Book book = new Book(authorName, price);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            //throw e;
        }

        System.out.println("Program finished successfully");
    }
}
