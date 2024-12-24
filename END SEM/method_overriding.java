class Animal{
    void eat(){
        System.out.println("Animal eating....");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
}



public class method_overriding {
    public static void main(String[] args) {
        Dog abhi = new Dog();
        abhi.eat();
        
    }
}
