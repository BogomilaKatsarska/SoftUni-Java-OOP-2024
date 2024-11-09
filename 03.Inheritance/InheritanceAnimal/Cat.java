package InheritanceAnimal;

public class Cat extends Animal{
    public Cat(String name, int age, Gender gender){
        super(name, age, gender);
    }
    @Override
    public void produceSound(){
        System.out.println("Meow meow");
    }
}
