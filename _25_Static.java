class Mobile {
    String brand;
    int price;
    String network;

    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class _25_Static {
    public static void main(String[] args) {

        // static memebers can access with classname as well as through objects but 
        // The static field should be accessed in a static way
        
        // static shares common memory among all objects

        Mobile.name = "SmartPhone";

        Mobile obj1 = new Mobile();

        // obj1.name= "New Smartphone";

        obj1.brand = "Apple";
        obj1.price = 1500;
  
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
  

        obj1.show();
        obj2.show();
    }
}
