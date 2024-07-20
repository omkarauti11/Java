

// When you declare a variable as final, its value cannot be changed once it is assigned. This makes it a constant.

/*

public class Example {
    public static final int MAX_SIZE = 100; // This is a constant
}


*/


// When you declare a method as final, it cannot be overridden by subclasses.


/*

public class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class Child extends Parent {
    // This will cause a compile-time error
    // @Override
    // public void display() {
    //     System.out.println("Trying to override.");
    // }
}



*/


// When a class is declared as final, it cannot be subclassed. 

/*


public final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// This will cause a compile-time error
// public class SubClass extends ImmutableClass {
// }



*/