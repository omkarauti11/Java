class A{
    int num = 1;
}

class B extends A {
    int num = 2;

    public int getValue() {
        int num = 3;
        System.out.println("Local num in getValue(): " + num);
        System.out.println("Instance num in B (this.num): " + this.num);
        System.out.println("Instance num in A (super.num): " + super.num);
        return super.num;
    }
}

public class _34_ThisVsSuper {
    public static void main(String a[]) {
        B obj = new B();
        System.out.println(obj.num);
        System.out.println(obj.getValue());
    }
}


// Naming Convention

// Camel casing

// class and interface - Calculator       ( first letter capital)
//variable and method - marks, show()    (small letters)

                        //showMyMarks()     (first letter of each word is small ,capital from second word)
                        //show_my_marks()   (words join by underscore)

// constants - PIE, BRAND       (all capital letters)