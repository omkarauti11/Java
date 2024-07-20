class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}


// Dynamic Method Dispatch, also known as runtime polymorphism in Java, is a mechanism by which a call to an overridden method is resolved at runtime rather than compile time.


public class _42_DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal myAnimal; // reference variable of type Animal
        
        myAnimal = new Dog(); // myAnimal refers to a Dog object
        myAnimal.sound(); // Calls Dog's sound method
        
        myAnimal = new Cat(); // myAnimal refers to a Cat object
        myAnimal.sound(); // Calls Cat's sound method

    }
}

