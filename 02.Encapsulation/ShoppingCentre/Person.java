package ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() < 1 || name.equals(" ")) {
            throw new IllegalArgumentException("Name should be a valid string");
        }
        this.name = name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    private void setMoney(double money) {
        if (money <= 0){
            throw new IllegalArgumentException("Cost should be a positive number.");
        }
        this.money = money;
    }
    public void buyProduct(Product product){
        if (this.money < product.getCost()){
            throw new IllegalArgumentException("Person cannot afford this product.");
        } else {
            this.money -= product.getCost();
            this.products.add(product);
        }
    }
}
