class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    // Without this keyword 
    public void SetAge(int age, Human obj) {
        Human obj1 = obj;
        obj1.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class _30_ThisKeyword {
    public static void main(String[] args) throws ClassNotFoundException {

        Human obj = new Human();

        obj.SetAge(30, obj);
        obj.setName("Reddy");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
