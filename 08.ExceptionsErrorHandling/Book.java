package Exceptions;

public class Book {
    private String author;
    private double price;

    public Book(String author, double price){
        setAuthor(author);
        setPrice(price);
    }

    public void setAuthor(String author){
        if (price < 0){
            throw new InvalidPriceException("Invalid number" + price + "for Book price, make sure the price is positive number.");
        }
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
