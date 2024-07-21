
abstract class Computer {
    public abstract void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code, compile, run");
    }

}

class Desktop extends Computer {
    public void code() {
        System.out.println("code, compile, faster");
    }
}

class Developer {
   
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class _50_NeedOfInheritance {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();

        navin.devApp(lap);
        navin.devApp(desk);

    }
}
