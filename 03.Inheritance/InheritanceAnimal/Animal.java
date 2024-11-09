package InheritanceAnimal;

public class Animal {
    private String name;
    private int age;
    private Gender gender;

    public Animal(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
    public void produceSound(){
        System.out.println("");
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
