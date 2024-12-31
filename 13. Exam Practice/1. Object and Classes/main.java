
class Animal { // animal class

    private String Name; // with some private attributes
    private int age;

    // Constructor
    Animal(String Name) {
        this.Name = Name;
    }

    //Constructor Overloading.
    Animal(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    // Method hogaya ji
    void eat() {
        System.out.println(this.Name + " is eating");
    }

    void getDetails() {
        System.out.println("---- Here's The Details----");
        System.out.println("Name : " + Name + "\nAge : " + age);
    }

}

class main {

    public static void main(String[] args) {
        Animal Ranbir = new Animal("Ranbir"); // Ranbir is now an instance of class ANimal (Not the movie).
        Ranbir.getDetails(); // Get Details method will be invoked from class.

        Animal Salman = new Animal("Salman", 55);
        Salman.eat();
        Salman.getDetails();
    }
}