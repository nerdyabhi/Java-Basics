
class Complex {

    double real;
    double imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex(Complex Obj) {
        this.real = Obj.real;
        this.imaginary = Obj.imaginary;
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    public static Complex multiply(Complex a, Complex b){
        return new Complex((a.real*b.real)-(a.imaginary*b.imaginary), (a.real*b.real)+(a.imaginary*b.imaginary));
    }
}

class q12 { 

    public static void main(String[] args) {
        Complex defaultComplex = new Complex(); // Default
        defaultComplex.display();
        
        Complex parameterizedComplex = new Complex(5, 2); // Parameterized
        parameterizedComplex.display();
        
        Complex copiedComplex = new Complex(parameterizedComplex); // Copy
        copiedComplex.display();

        Complex sumComplex = Complex.add(parameterizedComplex, copiedComplex); // Addition
        sumComplex.display();

        Complex differenceComplex = Complex.sub(parameterizedComplex, copiedComplex); // Subtraction
        differenceComplex.display();

        Complex productComplex = Complex.multiply(parameterizedComplex, copiedComplex); // Multiplication
        productComplex.display();
    }
}
