package InheritanceAnimal;

public class TomCat extends Cat {
    private static final Gender gender = Gender.Male;

    public TomCat(String name, int age){
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("MEOW");
    }
}

