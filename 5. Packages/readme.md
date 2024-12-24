# Java Packages

## Introduction
A package in Java is a namespace that organizes a set of related classes and interfaces. Conceptually, you can think of packages as being similar to different folders on your computer. They help to avoid name conflicts and to control access to classes, interfaces, and other resources.

## Benefits of Using Packages
1. **Namespace Management**: Packages help to avoid class name conflicts.
2. **Access Protection**: Packages provide access protection to classes and interfaces.
3. **Organized Code**: Packages help to organize your code in a modular fashion.

## Creating a Package
To create a package, use the `package` keyword followed by the package name at the top of your Java source file. For example:
```java
package com.example.myapp;
public class MyClass {
    // class body
}
```

## Using a Package
To use a class or interface from a package, you need to import it using the `import` statement. For example:
```java
import com.example.myapp.MyClass;
public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // use obj
    }
}
```

## Types of Packages
1. **Built-in Packages**: Java provides a large number of built-in packages, such as `java.lang`, `java.util`, `java.io`, etc.
2. **User-defined Packages**: These are packages created by the user to categorize their project classes and interfaces.

## Example
Here is an example of creating and using a user-defined package:

### Step 1: Create a Package
```java
// File: /c:/Users/Abhi Sharma/JAVA/5. Packages/com/example/util/Utility.java
package com.example.util;
public class Utility {
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
```

### Step 2: Use the Package
```java
// File: /c:/Users/Abhi Sharma/JAVA/5. Packages/com/example/app/Main.java
package com.example.app;
import com.example.util.Utility;
public class Main {
    public static void main(String[] args) {
        Utility.printMessage("Hello, Packages!");
    }
}
```

## Conclusion
Packages are a fundamental part of Java programming that help in organizing code, managing namespaces, and providing access control. By using packages effectively, you can create well-structured and maintainable Java applications.
