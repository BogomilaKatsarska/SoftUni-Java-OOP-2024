package SOLID_Liskov;

import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) throws OperationNotSupportedException {

        Worker worker = new Worker();
        Restaurant.processOrder(worker);

        Person person = new Person();
        Restaurant.processOrder(person);

        Robot robot = new Robot();
        Restaurant.processOrder(robot);

        // Всеки дъщерен клас трябва да може да прави това, което бащиният клас описва като действия
    }
}