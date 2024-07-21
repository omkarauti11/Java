class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    // class B {
    //     public void config() {
    //         System.out.println("in config");
    //     }
    // }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class _47_InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        // Need of outer class object

        // A.B obj1 = obj.new B();
        // obj1.config();

        // Static class
        A.B obj1 = new A.B();
        obj1.config();

    }
}
