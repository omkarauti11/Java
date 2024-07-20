class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void SetAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class _28_Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.SetAge(30);
        obj.setName("Reddy");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
