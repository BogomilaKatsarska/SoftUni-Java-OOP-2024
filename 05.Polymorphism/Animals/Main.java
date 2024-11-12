package PolyAnimals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom", "Jerry");
        Animal dog = new Dog("Spike", "Tom");
    }

    public static void makeAnimalPresentThemself(Animal animal){
        System.out.println(animal.explainSelf());
    }

}
