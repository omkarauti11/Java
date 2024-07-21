enum Laptop {

    Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    Laptop() {
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("in Laptop : " + this.name());
    }
}

public class _55_EnumClass {
    public static void main(String[] args) {

        Laptop lap = Laptop.Mackbook;
        System.out.println(lap + " : " + lap.getPrice());

        lap.setPrice(3000);

        System.out.println(lap + " : " + lap.getPrice());

        // for (Laptop lap : Laptop.values()) {
        //     System.out.println(lap + " : " + lap.getPrice());
        // }
    }
}
