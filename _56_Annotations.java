class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("in show B");
    }
}

public class _56_Annotations {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();

    }
}
