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

public class downcasting {
    public static void main(String[] args) {
       Animal abc = new Dog();      // Access subclass-specific method
       Dog neena = (Dog) abc;
       neena.wagTail();
    }
}
