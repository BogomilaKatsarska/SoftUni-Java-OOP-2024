package SOLID_Liskov;

import javax.naming.OperationNotSupportedException;

public class Robot extends Worker {

    @Override
    public void getFoodFromTheKitchen() {
        // 1 min
    }

    // Robot cannot run to the table => Liskov substitution not applied
    @Override
    public void runToTheTable() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}