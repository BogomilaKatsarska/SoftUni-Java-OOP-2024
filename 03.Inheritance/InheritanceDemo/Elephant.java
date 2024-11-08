package InheritaneDemo;

public class Elephant extends Animal{

    private int trunkLength; // Дължина на хобот

    public Elephant(String name, int age, int trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }
}
