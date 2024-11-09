package InheritanceAnimal;

public class Kitten extends Cat{
    private static final Gender gender = Gender.Female;

    public Kitten(String name, int age){
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Meow");
    }
}
