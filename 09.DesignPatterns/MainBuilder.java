package DesignPatterns;

public class MainBuilder {
    public static void main(String[] args) {
        Address address = Address.builder()
                .setName("Bogomila")
                .setEmail("az@abv.bg")
                .build();
    }
}
