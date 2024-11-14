package ReflAnn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainPerson {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // get access to Person class:
        Class personClass = Person.class; // get reference to 'Person' class
        Class personClassOption2 = Class.forName("ReflAnn.Person");

        System.out.println(personClass.getName()); // package.nameOfClass
        System.out.println(personClass.getSimpleName()); // nameOfClass

        System.out.println(personClass.getSuperclass().getSimpleName()); // get the name of the paret class i.e.: Object

        // getDeclaredFields(Declared is for all access modifiers) vs. getFields(only public fields);
        Field[] declaredFields = personClass.getDeclaredFields();

        // get the interfaces of a class
        Class[] interfaces = personClass.getInterfaces();
        System.out.println("Interfaces listed below:");
        for (Class anInterface: interfaces){
            System.out.println(anInterface.getSimpleName());
        }

        for (Field field: declaredFields){
            System.out.println(field.getName() + " is of type: " + field.getType());
        }

        //check if field 'id' has been created
        boolean idExists = false;

        for (Field field: declaredFields){
            if (field.getName().equals("id")){
                idExists = true;
                break;
            }
        }
        if (idExists){
            System.out.println("100/100");
        } else {
            System.out.println("0/100");
        }
        System.out.println();
        Constructor[] declaredConstructors = personClass.getDeclaredConstructors();
        for(Constructor constructor: declaredConstructors){
            System.out.println(constructor);
        }

        // creating an object from class with private constructor below:
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        constructor.newInstance("Bogomila");
    }
}
