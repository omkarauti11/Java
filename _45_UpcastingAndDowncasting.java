
class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in show B");
    }
}

public class _45_UpcastingAndDowncasting {
    public static void main(String[] args) {
        
        // creating an instance of B and assigning it to a reference of type A. This is known as upcasting.
        // A is the superclass, and B is the subclass. Upcasting is safe and implicit because B is an A (i.e., every instance of B is also an instance of A).
        A obj = new B();
        
        // obj is of type A, Java will look for the show() method in class A. However, because obj actually points to an instance of B, Java will use the overridden show() method in B (this is due to dynamic method dispatch).
        // If B overrides the show() method, that overridden version will be executed.
        obj.show();


        // This line performs an explicit cast. You're telling Java that obj (which is of type A) should be treated as type B. This cast is safe because obj actually refers to an instance of B. If obj were not actually an instance of B, this would throw a ClassCastException at runtime.
       
        B obj1 = (B) obj;

        // obj1 is a reference of type B. Since obj1 is a B and it points to the same instance of B, calling show() will invoke B's version of show().
        obj1.show();

    }
}
