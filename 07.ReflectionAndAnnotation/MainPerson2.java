package ReflAnn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainPerson2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class personClass = Class.forName("ReflAnn.Person");

        Field[] allFields = personClass.getDeclaredFields();
        Field[] publicFields = personClass.getFields();

        System.out.println(allFields[0].getName());
        System.out.println(allFields[0].getType());

        //getting field content for specific object
        Person person = new Person();
        Field field = personClass.getDeclaredField("name"); // getting the value of the field 'name' for specific obj person
        field.setAccessible(true);
        System.out.println(field.get(person));
        field.set(person, "Bogomila"); // can change a value for a specific field in object
        System.out.println(field.get(person));

        Method tellSumMethod = personClass.getDeclaredMethod("tellSum", int.class, int.class);
        System.out.println(tellSumMethod.invoke(person, 3, 4));

        int mask = personClass.getDeclaredField("name").getModifiers(); // returns int, not concrete access modifier
        System.out.println(Modifier.isPrivate(mask));
        System.out.println(Modifier.isPublic(mask));

    }
}
