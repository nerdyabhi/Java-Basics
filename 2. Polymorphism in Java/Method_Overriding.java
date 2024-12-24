class Animal{
    String name = "Animal 69";

    public void sound(){
        System.out.println("Animal Makes weird sound");
    }
}

class Dog extends  Animal{
    void eat(){
        System.out.println("Who let the dogs out? Bark Bark");
    }

   public void sound(){
        System.out.println("Okayyy Dog Overwrites the weird Sound hehe");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        
        // Upcasting
        Animal myDog = new Dog(); // Upcasting: Dog object is treated as an Animal
        myDog.sound(); // Output: Dog barks (Runtime polymorphism)

        // DownCasting
        Animal myAnimal = new Dog(); // Upcasting
        Dog myRealDog = (Dog) myAnimal; // Downcasting
        myRealDog.sound(); // Now you can call Dog-specific methods

    }
}
