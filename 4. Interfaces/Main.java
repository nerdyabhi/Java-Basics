
interface A {

    int age = 69; // by default final and static.
    String name = "Alien Sharma";

    void show(); // by default public abstract

    void config();
}

//  can't instantiate  the interface 
// interface just show you the design , it can't be instantiated.
// so what?? Have to implements an interface with some class
class B implements A {

    public void show() {
        System.out.println("B showing.");
    }

    public void config() {
        System.out.println("Configuration");
    }

}

class Main {

    public static void main(String[] args) {
        A obj = new B();

        obj.show();
        obj.config();
        System.out.println(A.name + " " + A.age);
    }
}
