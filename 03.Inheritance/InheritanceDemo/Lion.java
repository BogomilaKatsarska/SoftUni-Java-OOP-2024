package InheritaneDemo;

public class Lion extends Animal{

    private String maneColor; //Грива на лъв

    public Lion(String name, int age, String maneColor) {
        super(name, age);
        this.maneColor = maneColor;
    }

    @Override
    public void eat(){
        //super.eat(); // super - refers to the parent class
        System.out.println("The lion is eating meat.");
    }

    public void roar(){
        System.out.println("The lion is roaring and his mane color is " + this.maneColor);
    }
}
