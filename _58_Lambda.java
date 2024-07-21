@FunctionalInterface
interface A {
    void show(int i, int j);

}

public class _58_Lambda {

    public static void main(String[] args) {

        A obj = new A() {
            public void show(int i, int j) {
                System.out.println("in show: " + i);
            }
        };

        obj.show(7,5);

        // A obj = (int i, int j) -> System.out.println("in show " + i);

        // obj.show(5, 8);

    }
}
