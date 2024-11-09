package InheritanceNFS;

public class CrossMotorcycle extends Motorcycle{
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
