package SOLID_Food;

import java.util.List;

public interface Product {

    double amountOfCalories();

    class QuantityCalculatorDrink implements Calculator<Drink> {

        @Override
        public double sum(List<Drink> products) {
            return products.stream().mapToDouble(Drink::amountOfDrinks).sum();
        }

        @Override
        public double average(List<Drink> products) {
            return sum(products) / products.size();
        }
    }
}