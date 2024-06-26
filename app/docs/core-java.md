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

# Inheritance and Polymorphism
Inheritance and polymorphism are two key concepts in object-oriented programming that allow for code reuse, flexibility, and extensibility. Let's delve into each concept:

1. **Inheritance**:
   - **Definition**: Inheritance is a mechanism by which a class (subclass or child class) can inherit properties and behaviors (methods and fields) from another class (superclass or parent class). The subclass can then extend or modify the inherited functionality or introduce new functionality of its own.
   - **Syntax**: In Java, you use the `extends` keyword to establish an inheritance relationship between classes. For example:

     ```java
     class ParentClass {
         // Parent class members
     }

     class ChildClass extends ParentClass {
         // Child class members
     }
     ```

   - **Benefits**:
      - Code Reusability: Inheritance allows you to reuse code from existing classes, reducing redundancy and promoting modular design.
      - Hierarchical Structure: Inheritance enables the creation of a hierarchical class structure, with classes organized based on their relationships.
      - Polymorphism: Inheritance is closely related to polymorphism, as it allows objects of subclasses to be treated as objects of their superclass.

2. **Polymorphism**:
   - **Definition**: Polymorphism refers to the ability of objects to take on multiple forms or behaviors. In the context of inheritance, polymorphism allows objects of subclasses to be treated as objects of their superclass, enabling flexibility and extensibility in method invocation.
   - **Types**:
     Certainly! Let's delve deeper into compile-time (static) and run-time (dynamic) polymorphism:
     - **Compile-Time Polymorphism (Static Binding)**:

        - **Definition**: Compile-time polymorphism, also known as static binding or early binding, occurs when the compiler determines which method to invoke based on the method signature at compile time.

        - **Example**: Method overloading is a form of compile-time polymorphism where multiple methods with the same name but different parameters coexist within the same class. The appropriate method to be invoked is determined by the number and types of arguments passed to the method.

          ```java
          class MyClass {
              void display(int num) {
                  System.out.println("Displaying integer: " + num);
              }
         
              void display(String str) {
                  System.out.println("Displaying string: " + str);
              }
          }
          ```

        - **Benefits**:
           - Efficiency: Compile-time polymorphism results in efficient code execution because method resolution occurs at compile time, reducing runtime overhead.
           - Code Readability: Method overloading can improve code readability by providing intuitive method names for different parameter types or combinations.

     - **Run-Time Polymorphism (Dynamic Binding)**:

        - **Definition**: Run-time polymorphism, also known as dynamic binding or late binding, occurs when the JVM determines which method to invoke at runtime based on the actual object type.

        - **Example**: Method overriding is a form of run-time polymorphism where a subclass provides its own implementation of a method defined in its superclass. The method to be invoked is determined by the actual object type at runtime.

          ```java
          class Animal {
              void makeSound() {
                  System.out.println("Animal makes a sound");
              }
          }

          class Dog extends Animal {
              @Override
              void makeSound() {
                  System.out.println("Dog barks");
              }
          }

          public class Main {
              public static void main(String[] args) {
                  Animal animal = new Dog(); // Upcasting
                  animal.makeSound(); // Output depends on actual object type (Dynamic Binding)
              }
          }
          ```

        - **Benefits**:
           - Flexibility: Run-time polymorphism allows for more flexible and adaptable code by enabling method invocations to vary based on the actual object type at runtime.
           - Extensibility: Run-time polymorphism enables the addition of new subclasses with their own behavior while still adhering to the superclass interface, without modifying existing code.

In summary, **compile-time polymorphism** is determined at compile time based on the method signature, while **run-time polymorphism** is determined at runtime based on the actual object type. Both forms of polymorphism offer benefits in terms of efficiency, code readability, flexibility, and extensibility, and understanding their differences is crucial for effective object-oriented programming.

In summary, inheritance and polymorphism are fundamental concepts in object-oriented programming that facilitate code reuse, flexibility, and extensibility. Inheritance establishes a hierarchical relationship between classes, while polymorphism allows objects to exhibit multiple forms or behaviors at runtime, enabling dynamic method invocation and code flexibility.

# Immutable class
- The class is marked as `final` to prevent subclassing, which could potentially introduce mutability. 
- All fields are `private` and `final`, ensuring that they cannot be modified outside the class.
- Getter methods allow access to the values of the fields but **No setter methods** are provided, preventing modification of the fields , ensuring immutability.
- One of the most commonly used immutable classes in Java is `java.lang.String`. Here's an example of how String class is immutable:
`
String str = "Hello";
str.concat(" World");
`
In this example, even though the concat() method is called on the str object, the original string "Hello" remains unchanged. This is because String objects in Java are immutable, meaning their values cannot be modified after they are created.

Here's why String class is immutable:

- **No Setter Methods**: The String class does not provide any setter methods to modify the value of a string once it is created. Once a String object is created, its value cannot be changed.
- **String Pool**: Java maintains a string pool, which stores unique string literals in memory. When you perform operations on strings (like concatenation), Java creates a new string object with the modified value, leaving the original string unchanged. This ensures that the original string remains immutable.
- **Security**: Immutable strings are also useful for security purposes. For example, when you use a String object to store sensitive information like passwords, you can be confident that the value of the string cannot be modified by external code.
The immutability of the String class in Java provides several benefits, including thread safety, simpler concurrency control, and efficient memory usage.

# QA

1. **Encapsulation**:
   - **Question**: Explain the difference between encapsulation and information hiding.
   - **Answer**: Encapsulation is the concept of bundling data (fields) and methods (behavior) that operate on the data into a single unit (class) and restricting access to the internal state of the object. Information hiding, on the other hand, is the principle of hiding the implementation details of a class and only exposing a clean interface to interact with the class.

   - **Question**: How would you design an immutable class representing a complex data structure like a linked list or a binary tree?
   - **Answer**: To design an immutable class for a complex data structure, we would:
      - Declare all fields as `private` and `final`.
      - Initialize all fields in the constructor and ensure they are not modified afterward.
      - Avoid providing setter methods and ensure that getter methods return copies of mutable objects to prevent modification.

   - **Question**: What are the advantages and disadvantages of using getter and setter methods for accessing and modifying class fields?
   - **Answer**: Advantages of using getter and setter methods include encapsulation, allowing controlled access to fields, and facilitating future changes in implementation. Disadvantages include potential violation of encapsulation if used excessively, increased verbosity, and the risk of exposing too much internal state.

2. **Inheritance**:
   - **Question**: Describe the fragile base class problem and how it can be mitigated in Java.
   - **Answer**: The fragile base class problem occurs when changes to a superclass (base class) can inadvertently break subclasses that rely on the superclass's implementation details. This can be mitigated by designing classes with clear contracts and minimizing dependencies between subclasses and the superclass.

   - **Question**: How does Java prevent multiple inheritance, and what alternatives does it provide?
   - **Answer**: Java prevents multiple inheritance of state (fields) to avoid the diamond problem and maintain a single inheritance hierarchy. However, it allows multiple inheritance of type (interfaces), enabling classes to implement multiple interfaces.

   - **Question**: Explain the concept of method overriding and method hiding in Java. Provide examples to illustrate the differences between the two.
   - **Answer**: Method overriding occurs when a subclass provides its own implementation of a method defined in its superclass, while method hiding occurs when a subclass defines a static method with the same signature as a static method in its superclass.

3. **Polymorphism**:
   - **Question**: What is dynamic method dispatch, and how does it enable run-time polymorphism in Java?
   - **Answer**: Dynamic method dispatch is the mechanism by which the JVM determines which method to invoke at runtime based on the actual object type. It enables run-time polymorphism by allowing objects of different subclasses to be treated as objects of their superclass.

   - **Question**: Describe the difference between static polymorphism and dynamic polymorphism. Provide examples to illustrate each.
   - **Answer**: Static polymorphism (compile-time polymorphism) occurs when the compiler determines which method to invoke based on the method signature, such as method overloading. Dynamic polymorphism (run-time polymorphism) occurs when the JVM determines which method to invoke at runtime, such as method overriding.

   - **Question**: How can you achieve polymorphism without using inheritance in Java?
   - **Answer**: Polymorphism can be achieved without using inheritance in Java through method parameterization, where a method accepts arguments of different types and behaves differently based on the actual types of the arguments.

4. **General**:
   - **Question**: Explain the concept of access modifiers in Java and how they relate to encapsulation and information hiding.
   - **Answer**: Access modifiers in Java (such as `public`, `protected`, `default`, and `private`) control the visibility of classes, methods, and fields, and they play a crucial role in encapsulation and information hiding.

   - **Question**: What are the design principles SOLID, and how do they apply to object-oriented programming concepts like encapsulation, inheritance, and polymorphism?
   - **Answer**: The SOLID principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, and Dependency Inversion) provide guidelines for designing maintainable and extensible object-oriented software.

   - **Question**: Can you provide an example of the Liskov Substitution Principle (LSP) violation, and explain why it violates the principle?
   - **Answer**: An example of a violation of the Liskov Substitution Principle (LSP) occurs when a subclass cannot be substituted for its superclass without affecting the correctness of the program. For instance, if a subclass overrides a superclass method and changes its behavior in a way that breaks the contract defined by the superclass, it violates LSP.

5. **SOLID**
   - SOLID is an acronym representing five design principles in object-oriented programming (OOP) intended to guide software development and promote code maintainability, extensibility, and scalability. Each principle addresses a specific aspect of OOP design and emphasizes the importance of writing clean, modular, and flexible code. Let's break down each principle:

   1. **Single Responsibility Principle (SRP)**:
      - **Definition**: A class should have only one reason to change, meaning it should have only one responsibility or function. This principle advocates for cohesive and focused classes that encapsulate a single aspect of functionality.
      - **Example**: In an online store application, a `Product` class should be responsible for representing product data, while a `Cart` class should be responsible for managing shopping cart operations.

   2. **Open/Closed Principle (OCP)**:
      - **Definition**: Software entities (classes, modules, functions) should be open for extension but closed for modification. This means that existing code should be closed for modification to avoid introducing bugs or breaking existing functionality, but it should be open for extension to accommodate new requirements or features.
      - **Example**: Using inheritance and polymorphism to extend behavior without modifying existing code. For instance, adding new shapes to a drawing application without modifying the existing drawing code.

   3. **Liskov Substitution Principle (LSP)**:
      - **Definition**: Subtypes should be substitutable for their base types without altering the correctness of the program. In other words, objects of a superclass should be replaceable with objects of their subclasses without affecting the behavior of the program.
      - **Example**: If `Square` is a subclass of `Rectangle`, it should be possible to use a `Square` object wherever a `Rectangle` object is expected without causing unexpected behavior.

   4. **Interface Segregation Principle (ISP)**:
      - **Definition**: Clients should not be forced to depend on interfaces they don't use. This principle emphasizes creating fine-grained interfaces tailored to specific client needs rather than large, monolithic interfaces.
      - **Example**: Breaking down a large interface into smaller, more specialized interfaces to avoid imposing unnecessary dependencies on client classes.

   5. **Dependency Inversion Principle (DIP)**:
      - **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. This principle promotes loose coupling between modules and encourages the use of interfaces to decouple higher-level modules from lower-level implementation details.
      - **Example**: Inversion of control (IoC) containers, such as Spring Framework, where dependencies are injected into classes rather than being created directly by those classes.

Together, these principles form the foundation of good object-oriented design, promoting code that is modular, flexible, and easy to maintain and extend. Adhering to SOLID principles helps developers write more robust, scalable, and maintainable software systems.