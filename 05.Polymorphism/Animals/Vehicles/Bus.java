package PolyVehicles;

public class Bus extends VehicleImpl {

    private static final boolean DEFAULT_IS_EMPTY = true;
    private static final boolean DEFAULT_IS_AC_ON = false;

    private boolean isEmpty;
    private boolean isAcON;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = DEFAULT_IS_EMPTY;
        this.isAcON = DEFAULT_IS_AC_ON;
    }

    @Override
    public String drive(double distance) {

        if (isAcON) {
            super.setFuelConsumption(getFuelConsumption() - 1.4);
            isAcON = false;
        }

        if (!isEmpty) {
            super.setFuelConsumption(getFuelConsumption() + 1.4);
            isAcON = true;
        }

        return super.drive(distance);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}