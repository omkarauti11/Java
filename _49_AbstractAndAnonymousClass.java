abstract class A {
    public abstract void show();

    public abstract void config();

}

// class B extends A {
//     public void show() {
//         System.out.println("in B show");
//     }

//     public void config() {
//         System.out.println("in new show");
//     }
// }

public class _49_AbstractAndAnonymousClass {
    public static void main(String[] args) {

        // A obj=new B();

        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in new config");
            }
        };
        
        obj.show();

    }
}
