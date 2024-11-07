package ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        setName(name);
        setCost(cost);
    }

    private void setCost(double cost) {
        if (cost <= 0){
            throw new IllegalArgumentException("Cost should be a positive number.");
        }
        this.cost = cost;
    }

    private void setName(String name) {
        if (name.length() < 1 || name.equals(" ")) {
            throw new IllegalArgumentException("Name should be a valid string");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
