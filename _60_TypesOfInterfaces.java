// types of interfaces in Java

// 1. Normal Interface
// A normal interface in Java is an interface that contains two or more methods. These methods can be either abstract or default (from Java 8 onwards).

// Characteristics:

// Can contain multiple abstract methods.
// Can include default methods and static methods.
// Cannot have instance fields or constructors.

interface Vehicle {
    void start();
    void stop();
    
    default void honk() {
        System.out.println("Honk! Honk!");
    }
    
    static void clean() {
        System.out.println("Cleaning the vehicle.");
    }
}



// 2. Functional Interface (SAM)
// A functional interface, also known as a Single Abstract Method (SAM) interface, contains exactly one abstract method. This type of interface is used extensively in functional programming with lambda expressions and method references introduced in Java 8.

// Characteristics:

// Contains exactly one abstract method.
// Can contain multiple default and static methods.
// Can be annotated with @FunctionalInterface for clarity and to prevent accidental addition of methods.

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}


// 3. Marker Interface
// A marker interface is an interface that does not contain any methods or fields. It is used to indicate that a class possesses certain properties or behaviors. Marker interfaces are often used for type tagging and to provide metadata to the JVM or other frameworks.

// Characteristics:

// Contains no methods or fields (blank interface).
// Used to signal or mark classes with specific capabilities or properties.

interface Serializable {
    // No methods or fields
}




public class _60_TypesOfInterfaces {
    // Create obj of subclass implementing interface
}
