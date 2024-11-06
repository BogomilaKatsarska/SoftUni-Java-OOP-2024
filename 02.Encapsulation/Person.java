package SortByNameAndAge;


public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary){
        setFirstName(firstName);
        //this.firstName = firstName;
        setLastName(lastName);
//        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName.length() <= 3){
            throw new IllegalArgumentException("First name should be longer than 3letters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (this.firstName.length() <= 3){
            throw new IllegalArgumentException("Last name should be longer than 3letters");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (this.age < 30){
            this.salary += (bonus / 200) * salary;
        } else {
            this.salary += (bonus / 100) * salary;
        }
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + " is " + age + " years old and has a salary of " + salary;
    }
}
