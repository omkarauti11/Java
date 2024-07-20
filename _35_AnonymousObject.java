class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class _35_AnonymousObject {
    public static void main(String a[]) {
 
        // Object without reference variable
        
        new A(); // anonymous object
        new A().show();

    }
}
