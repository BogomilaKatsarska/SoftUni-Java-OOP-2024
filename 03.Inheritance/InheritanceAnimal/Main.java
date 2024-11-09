package InheritanceAnimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat("Bogomila", 4, Gender.Female);
        cat.produceSound();
        TomCat tomCat = new TomCat("Tom", 2);
        tomCat.produceSound();
    }
}
