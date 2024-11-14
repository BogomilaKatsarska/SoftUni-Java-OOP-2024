package ReflAnn;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class MainReflection2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class reflectionClass = Class.forName("ReflAnn.Reflection");

        Arrays.stream(reflectionClass.getDeclaredMethods()).
                filter(getter -> getter.getName().startsWith("get")).
                sorted(Comparator.comparing(Method::getName)).
                forEach(method -> System.out.printf("%s will return class %s%n", method.getName(), method.getReturnType()));

        System.out.println();

        Arrays.stream(reflectionClass.getDeclaredMethods()).
                filter(getter -> getter.getName().startsWith("set")).
                sorted(Comparator.comparing(Method::getName)).
                forEach(method -> System.out.printf("%s and will set field of class %s%n", method.getName(), method.getParameterTypes()[0].getSimpleName()));
    }
}
