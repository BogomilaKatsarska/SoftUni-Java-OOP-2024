package InheritanceAnimal;

public class Frog extends Animal{
    public Frog(String name, int age, Gender gender){
        super(name, age, gender);
    }
    @Override
    public void produceSound(){
        System.out.println("Ribbit");
    }
}
