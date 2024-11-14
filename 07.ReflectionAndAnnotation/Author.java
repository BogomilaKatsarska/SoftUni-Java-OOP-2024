package ReflAnn;

public @interface Author {
    String name();
    int age();
}

/*
1. @Target(ElementType.METHOD/ElementType.CONSTRUCTOR/ElementType.FIELD) :Target annotation
   @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
2. @Retention(RetentionPolicy.RUNTIME) :when to execute/not to execute the annotation
3.
*/
