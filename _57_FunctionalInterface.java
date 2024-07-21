// A functional interface contains only one abstract method. This is sometimes referred to as a SAM interface (Single Abstract Method interface).

// Functional interfaces can have any number of default or static methods. These methods do not count towards the single abstract method requirement.

// Functional interfaces can be implemented by lambda expressions, method references, or constructor references, making the code more concise and readable.

// @FunctionalInterface Annotation: While not required, the @FunctionalInterface annotation can be used to explicitly declare that an interface is intended to be a functional interface. This annotation helps to prevent accidental addition of abstract methods.



@FunctionalInterface
interface A {
    void show();
    static void Display(){
        System.out.println("Static");
    }

    public default void Display1(){
        System.out.println("Default");
    }
}

// class B implements A {
//     public void show() {
//         System.out.println("in Show");
//     }
// }

public class _57_FunctionalInterface {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in Show");
            }
        };

        // A obj = new B();
        obj.show();

        // Only access through interface name
        A.Display();


        obj.Display1();

    }
}
