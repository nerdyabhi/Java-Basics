class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class upscasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Calls overridden method in Dog class
        // animal.wagTail(); // ERROR: wagTail() is / in Animal
    }
}

// happens implicitly.
