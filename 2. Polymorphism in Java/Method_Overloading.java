class Calculator {
    // Overloaded methods with different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a , double b){
        return a + b;
    }
    
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the add(int, int) method
        System.out.println(calc.add(10, 20)); // Output: 30

        // Calls the add(int, int, int) method
        System.out.println(calc.add(10, 20, 30)); // Output: 60

        System.out.println(calc.add(0.58 , 29.0)); // Prints 29.58.
    }
}