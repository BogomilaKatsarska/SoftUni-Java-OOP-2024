package ReflAnn;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflectionClass = Class.forName("ReflAnn.Reflection");
        System.out.println(reflectionClass.getSimpleName());
        System.out.println();

        System.out.println(reflectionClass.getSuperclass().getSimpleName());
        System.out.println();

        Class[] interfaces = reflectionClass.getInterfaces();
        for(Class anInterface: interfaces){
            System.out.println(anInterface.getSimpleName());
        }
        System.out.println();

        Constructor declaredConstructor = reflectionClass.getDeclaredConstructor();
        Reflection o = (Reflection) declaredConstructor.newInstance();
        System.out.println(o.getEmail());
        System.out.println(o.getName());
        System.out.println(o.getWebAddress());
        System.out.println(o.getZip());


    }
}
