### **Abstract Class and `abstract` Keyword in Java**

An **abstract class** in Java is a class that is declared using the `abstract` keyword. It **cannot be instantiated** and serves as a blueprint for subclasses. The primary purpose of abstract classes is to provide **partial implementation** that subclasses can build upon, ensuring a common design structure.

---

### **Key Features of Abstract Classes**
1. **Declared Using `abstract`**:
   - Use the `abstract` keyword before the class name to define an abstract class.
   - Example:
     ```java
     abstract class Shape {
         abstract void draw(); // Abstract method
     }
     ```

2. **Contains Abstract Methods**:
   - Abstract methods are methods **without a body** (just a declaration).
   - Subclasses **must** provide the implementation for abstract methods.
   - Example:
     ```java
     abstract void draw(); // Abstract method
     ```

3. **Can Contain Concrete Methods**:
   - Abstract classes can also have methods with implementation (concrete methods).
   - Example:
     ```java
     void display() {
         System.out.println("This is a Shape");
     }
     ```

4. **Cannot Be Instantiated**:
   - You cannot create an object of an abstract class.
   - Example:
     ```java
     Shape s = new Shape(); // ERROR: Cannot instantiate
     ```

5. **Supports Inheritance**:
   - Subclasses inherit the abstract class and provide implementations for its abstract methods.

---

### **Why Use Abstract Classes?**
1. **Common Design**: Provide a base structure for related classes with some shared logic.
2. **Partial Implementation**: Share common code among subclasses while forcing subclasses to implement specific behaviors.
3. **Polymorphism**: Enable polymorphic behavior by treating subclass objects as instances of the abstract superclass.

---

### **Example: Abstract Class**
```java
abstract class Shape {
    String color;

    // Abstract method (no body)
    abstract void draw();

    // Concrete method (has body)
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();  // Upcasting
        Shape shape2 = new Rectangle();

        shape1.draw(); // Calls Circle's draw method
        shape2.draw(); // Calls Rectangle's draw method

        shape1.color = "Red";
        shape1.displayColor();
    }
}
```

---

### **What's Important About Abstract Classes?**
1. **Blueprint for Subclasses**:
   - Abstract classes enforce a contract for subclasses to implement essential methods.

2. **Polymorphism**:
   - Abstract classes allow you to treat objects of different subclasses as instances of the superclass, enabling flexible and dynamic code.

3. **Shared Code**:
   - They allow code reuse through concrete methods while delegating specific behavior to subclasses.

---

### **Abstract Class vs Interface**
| **Feature**               | **Abstract Class**                                     | **Interface**                                      |
|----------------------------|-------------------------------------------------------|---------------------------------------------------|
| **Keyword**                | `abstract`                                            | `interface`                                       |
| **Inheritance**            | A class can extend only one abstract class.           | A class can implement multiple interfaces.        |
| **Methods**                | Can have both abstract and concrete methods.          | All methods are implicitly abstract (until Java 8).|
| **Variables**              | Can have instance variables.                          | Only `public static final` constants are allowed. |
| **Use Case**               | Use when classes are closely related (e.g., Shape).   | Use for unrelated classes needing common behavior.|

---

### **Summary**
1. An **abstract class** provides a base structure with some implementation and forces subclasses to complete it.
2. Use the **`abstract` keyword** to define abstract classes or methods.
3. Abstract classes are **important** because they combine code reuse (via concrete methods) with flexibility (via abstract methods).