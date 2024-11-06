package HotelReservation;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discount) {

        double basePrice = pricePerDay * numberOfDays * season.getMultiplier();

        return basePrice - (basePrice * discount.getPercentage());
    }
}