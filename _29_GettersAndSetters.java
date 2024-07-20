class Human {

    private int age;
    private String name;

    // Double click --> Source Action --> Getters and Setters --> Select Variables

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class _29_GettersAndSetters {
    public static void main(String[] args) throws ClassNotFoundException {

        Human obj = new Human();

        obj.setAge(30);
        obj.setName("Reddy");
 
        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
