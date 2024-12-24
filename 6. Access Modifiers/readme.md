# Access Modifiers in Java

Access modifiers in Java are keywords that set the accessibility of classes, methods, and other members. They help in encapsulating the data and providing controlled access. There are four types of access modifiers in Java:

1. **Private**: The member is accessible only within the same class.
2. **Default**: The member is accessible only within the same package. If no access modifier is specified, it is considered default.
3. **Protected**: The member is accessible within the same package and subclasses.
4. **Public**: The member is accessible from any other class.

## Access Levels

| Modifier   | Class | Package | Subclass | World |
|------------|-------|---------|----------|-------|
| `private`  | Yes   | No      | No       | No    |
| `default`  | Yes   | Yes     | No       | No    |
| `protected`| Yes   | Yes     | Yes      | No    |
| `public`   | Yes   | Yes     | Yes      | Yes   |

## Example

```java
public class Example {
    private int privateVar;
    int defaultVar;
    protected int protectedVar;
    public int publicVar;

    public void display() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}
```

## Visual Representation

![Access Modifiers](https://www.javatpoint.com/images/access-modifiers/access-modifiers.png)
