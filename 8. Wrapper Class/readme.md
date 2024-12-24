In Java, **wrapper classes** are used to represent primitive data types as objects. They "wrap" the primitive types into objects, enabling functionality like passing primitives by reference or working with collections that only accept objects.

---

### **Key Points about Wrapper Classes**
1. **Purpose**:
   - Allow primitive types (`int`, `double`, etc.) to behave like objects.
   - Facilitate operations where objects are required, such as in collections (`ArrayList`, `HashMap`).

2. **List of Wrapper Classes**:
   - Each primitive type has a corresponding wrapper class:
     | **Primitive Type** | **Wrapper Class** |
     |--------------------|-------------------|
     | `byte`             | `Byte`           |
     | `short`            | `Short`          |
     | `int`              | `Integer`        |
     | `long`             | `Long`           |
     | `float`            | `Float`          |
     | `double`           | `Double`         |
     | `char`             | `Character`      |
     | `boolean`          | `Boolean`        |

3. **When to Use Wrapper Classes**:
   - When working with collections like `ArrayList`, which cannot store primitives:
     ```java
     ArrayList<Integer> list = new ArrayList<>();
     list.add(5); // Autoboxing: primitive 5 is converted to Integer
     ```
   - When methods require objects, not primitives:
     ```java
     Integer num = Integer.valueOf(10); // Wrapper class used
     ```

---

### **Key Concepts with Wrapper Classes**

#### **A. Autoboxing and Unboxing**
- **Autoboxing**: Automatic conversion of a primitive to its wrapper class object.
  ```java
  int a = 10;
  Integer b = a; // Autoboxing
  ```

- **Unboxing**: Automatic conversion of a wrapper class object to a primitive.
  ```java
  Integer a = 10;
  int b = a; // Unboxing
  ```

---

#### **B. Immutable Nature**
- Wrapper class objects are **immutable**. Once created, their values cannot be changed.
  ```java
  Integer num = Integer.valueOf(10);
  num = Integer.valueOf(20); // A new object is created; old one is not modified
  ```

---

#### **C. Utility Methods**
Wrapper classes provide several utility methods:
- **Conversion Methods**:
  - `toString()`: Converts a wrapper object to a `String`.
    ```java
    Integer num = 100;
    System.out.println(num.toString()); // Output: "100"
    ```
  - `parseXxx(String)`: Converts a `String` to a primitive.
    ```java
    int num = Integer.parseInt("100");
    ```

- **Constants**:
  - `MAX_VALUE` and `MIN_VALUE`: Represent the range of the primitive type.
    ```java
    System.out.println(Integer.MAX_VALUE); // Output: 2147483647
    ```

- **Comparisons**:
  - `compareTo()` for comparing objects.
    ```java
    Integer a = 5, b = 10;
    System.out.println(a.compareTo(b)); // Output: -1 (a < b)
    ```

---

### **Advantages of Wrapper Classes**
1. **Collections Compatibility**: Collections like `ArrayList` and `HashMap` store objects, not primitives.
2. **Utility Methods**: Provide useful methods for type conversions and comparisons.
3. **Object Functionality**: Primitives can be treated as objects, enabling more functionality.
4. **Nullable Values**: Wrapper classes can represent null, while primitives cannot.

---

### **Disadvantages**
1. **Performance Overhead**:
   - Autoboxing/unboxing can cause unnecessary object creation, affecting performance.
2. **Memory Usage**:
   - Wrapper objects use more memory than primitives due to additional object metadata.
3. **Immutability**:
   - Once created, wrapper objects cannot be changed.

---

### **Example: Wrapper Classes in Action**
```java
import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Primitive 10 is boxed into Integer

        // Unboxing
        int num = numbers.get(0); // Integer is unboxed into int

        // Utility Methods
        String str = Integer.toString(100); // Convert int to String
        int value = Integer.parseInt("123"); // Convert String to int
        System.out.println("String: " + str + ", Value: " + value);
    }
}
```

---

### **Real-World Uses**
1. **Collections**:
   - Storing primitive values in collections like `List` and `Map`.
2. **Type Conversion**:
   - Converting strings to primitives or vice versa.
3. **Null Handling**:
   - Representing null where primitives can't (e.g., in databases).

Let me know if you need examples or a deep dive into any specific wrapper class! 😊