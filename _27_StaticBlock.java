class Mobile {

    String brand;
    int price;
    String network;

    static String name;

    static {
        name = "Phone";
        System.out.println("in static block " + name);
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor ");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class _27_StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        // loads the class--> Static Block Executes
        // Class.forName("Mobile");

        // No Object --> no Class Loads --> No static Block Executes

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;

        Mobile.name="SmartPhone";
        
        // Execution 
        // Static Block --> Constructor
        

        // Static Block Executes once
        // Mobile obj2=new Mobile();
        System.out.println(Mobile.name);

    }

}
