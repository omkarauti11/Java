abstract class Car {

    int a = 10;
    static int b = 20;

    public abstract void drive();

    public abstract void fly();

    Car() {
        System.out.println("Abstract constructor..");
    };

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdateWagnoR extends WagnoR {
    public void fly() {
        System.out.println("flying...");
    }
}

public class _46_Abstract {
    public static void main(String[] args) {

        Car obj = new UpdateWagnoR();
        obj.drive();
        obj.playMusic();

        System.out.println(obj.a);
        System.out.println(UpdateWagnoR.b);
    }
}

// An abstract class cannot be instantiated directly. You cannot create an
// object of an abstract class.

// An abstract class can have abstract methods, which are methods declared
// without an implementation. Subclasses are required to provide implementations
// for these methods.

// An abstract class can also have concrete methods with implementations that
// can be inherited by subclasses.

// Abstract classes can have constructors, which are called when an instance of
// a subclass is created.

// Abstract classes can have fields (both static and instance variables).

// A subclass that inherits from an abstract class must implement all abstract
// methods from the abstract class unless the subclass is also abstract.