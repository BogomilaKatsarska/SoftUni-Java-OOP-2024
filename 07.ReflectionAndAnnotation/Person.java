package ReflAnn;

@Author(name="Bogomila", age=23)
public class Person implements Talker, Walker{
    //private int id;
    private String name;
    @Positive
    private int age;

    Person(){
        this.name = "some_name";
        this.age = 222;
    }

    Person(String name){
        this.name = name;
        this.age = 222;
    }

    private Person(int age){
        this.name = "some_name";
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int tellSum(int a, int b){
        return (a + b);
    }

    public int tellSum(int a, int b, int c){
        return (a + b + c);
    }
}
