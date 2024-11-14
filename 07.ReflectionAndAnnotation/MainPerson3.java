package ReflAnn;

import javafx.geometry.Pos;

import java.io.FileReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainPerson3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
//        Class personClass = Class.forName("ReflAnn.Person");
        Class<Person> personClass = Person.class;

        Positive positiveAnnotation = (Positive) personClass.getDeclaredAnnotation(Positive.class);

        Person person = new Person("Bogomila", 20);

        Field[] fields = personClass.getDeclaredFields();
        for(Field field: fields){
            if (field.isAnnotationPresent(Positive.class)){
                field.setAccessible(true);
                int value  = (int) field.get(person);
                if (value < 0){
                    throw new IllegalStateException("Age must be >= 0");
                }
            }
        }


        Author annotation = (Author) personClass.getDeclaredAnnotation(Author.class);
        System.out.println(annotation.name());

        System.out.println(annotation.age());
    }
}
