
===========================
Java Interfaces
===========================

What is an Interface?

---------------------
An **interface** in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are abstract by nature, meaning they cannot provide implementations for the methods they declare. Interfaces are used to specify a set of methods that a class must implement, providing a way to achieve abstraction and multiple inheritance in Java.

Key Points about Interfaces
---------------------------
1. **Abstract Methods**: Interfaces can contain abstract methods, which do not have a body (i.e., no implementation). Classes that implement the interface must provide implementations for these methods.
2. **Default Methods**: Interfaces can provide default methods with a default implementation. These methods can be overridden by implementing classes.
3. **Static Methods**: Interfaces can contain static methods, which are not associated with instances of the classes that implement the interface.
4. **Multiple Inheritance**: A class can implement multiple interfaces, allowing for a fo\rm of multiple inheritance since Java does not support multiple inheritance of classes.
