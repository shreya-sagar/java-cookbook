# Access-modifiers
In Java, access modifiers are keywords used to control the visibility of classes, fields, methods, and constructors. There are four main access modifiers:

1. **public**:
    - The `public` access modifier allows a class, field, method, or constructor to be accessed from any other class or package.

2. **protected**:
    - The `protected` access modifier allows a class, field, method, or constructor to be accessed within its own package or by subclasses (even if they are in different packages).

3. **default (no modifier)**:
    - If no access modifier is specified, the default access modifier is applied.

4. **private**:
    - The `private` access modifier restricts access to the member within its own class.

Access modifiers provide encapsulation and help in implementing the principle of information hiding. By controlling access to classes, methods, and fields, you can restrict the visibility of implementation details and expose only what is necessary for other classes to use.

# Types of Variables in Java

## Instance Variables:
- Declared within a class but outside of any method, constructor, or block.
- Each instance of the class (i.e., each object) has its own copy of instance variables.
- They represent the state of an object and define its attributes.

### Sample Code:
```java
public class Example {
    private int instanceVar; // Instance variable

    public void setInstanceVar(int value) {
        instanceVar = value;
    }
}
```

## Class Variables (Static Variables):
- Declared with the `static` keyword within a class but outside of any method, constructor, or block.
- There is only one copy of class variables per class, regardless of the number of instances created.
- They are shared among all instances of the class and are accessed using the class name.

### Sample Code:
```java
public class Example {
    private static int classVar; // Class variable

    public static void setClassVar(int value) {
        classVar = value;
    }
}
```

## Local Variables:
- Declared within a method, constructor, or block.
- Local variables are only visible within the scope in which they are declared (i.e., within the method, constructor, or block).
- They are created when the method, constructor, or block is entered and destroyed when it exits.

### Sample Code:
```java
public class Example {
    public void exampleMethod() {
        int localVar = 10; // Local variable
        System.out.println(localVar);
    }
}
```

## Parameters:
- Variables declared in the parameter list of a method, constructor, or lambda expression.
- They receive values when the method, constructor, or lambda expression is called.
- Parameters behave like local variables within the method, constructor, or lambda expression.

### Sample Code:
```java
public class Example {
    public void exampleMethod(int parameter) { // Parameter
        System.out.println(parameter);
    }
}
```

# `transient` keyword
- In Java, the `transient` keyword is used to indicate that a field should not be serialized when the object is converted into a byte stream, typically for storage or transmission purposes. When an object is serialized, all of its non-transient fields are converted into a byte stream, but transient fields are skipped.

Here's a brief overview of the purpose and usage of transient:

- **Serialization Control**: By marking a field as transient, you're telling the Java serialization mechanism to ignore that field when serializing the object. This can be useful when a field holds data that doesn't need to be persisted or transmitted along with the object.
- **Sensitive Data**: Fields that contain sensitive information, such as passwords or cryptographic keys, are often marked as transient to prevent them from being included in the serialized object. This helps maintain security by avoiding accidental exposure of sensitive data.
- **Performance Optimization**: Excluding certain fields from serialization can improve performance by reducing the size of the serialized object and the time it takes to serialize and deserialize it.
Here's an example of how you can use the transient keyword:

```java
import java.io.Serializable;

public class MyClass implements Serializable {
private int id;
private String name;
private transient double sensitiveData; // This field will not be serialized

    // Constructor, getters, setters, etc.
}
```
In this example, the sensitiveData field is marked as transient, so it will be excluded from the serialized form of MyClass objects. This is useful for protecting sensitive information from being persisted or transmitted.

