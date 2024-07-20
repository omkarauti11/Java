class Mobile {
    String brand;
    int price;
    String network;

    static String name;

    // Non-static method can access static members 
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // whenever static method uses non-static members pass object to access it
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }
}

public class _26_StaticMethod {
    public static void main(String[] args) 
	{

        // null
        System.out.println(Mobile.name);

        Mobile.name="SmartPhone";

		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;

		
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;

		// obj1.show();
		// obj2.show();

        
        // object can access a static method in Java, although it is not recommended. Static methods belong to the class, not to any specific instance of the class, and thus are typically called using the class name
        // obj1.show1(obj2);	
        // obj2.show1(obj1);

		Mobile.show1(obj1);	
	}
}
