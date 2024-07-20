// Method overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameter list as the method in the superclass.

class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class _38_MethodOverriding {
    public static void main(String args[]) {


        B obj = new B();
        obj.show();
        obj.config();

        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add(3, 4);
        // System.out.println(r1);
    }
}
