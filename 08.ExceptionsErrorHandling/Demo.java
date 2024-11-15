package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) { //Recovery of our program
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
        System.out.println(number * 2);
    }
}
