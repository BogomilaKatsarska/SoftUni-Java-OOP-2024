package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age){
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1 || name.equals(" ")){
            throw new IllegalArgumentException("Name should be at least one letter.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age > 15){
            throw new IllegalArgumentException("Age should be maximum 15years.");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    private double producePerDay(){
        if (this.getAge() < 6){
            return 2.0;
        } else if (this.getAge() >= 6 && this.getAge() < 12){
            return 1.0;
        } else {
            return 0.75;
        }
    }
    public double calculateProductPerDay(){
        return this.producePerDay();
    }

    @Override
    public String toString() {
        return "Chicken " + name + " " + age + " can produce eggs: " + calculateProductPerDay();
    }
}
