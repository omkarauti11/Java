
class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class _44_ObjectClassMethods {
    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Lenevo Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenevo Yoga";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);
        System.out.println(result);

        System.out.println(obj.toString());
        

    }
}
