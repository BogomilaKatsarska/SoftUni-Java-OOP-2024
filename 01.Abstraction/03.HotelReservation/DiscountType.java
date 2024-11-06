package HotelReservation;

public enum DiscountType {
    VIP(0.20),
    SecondVisit(0.10),
    None(0);

    private double percentage;

    DiscountType(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}