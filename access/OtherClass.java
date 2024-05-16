// This file defines another class in the same package to test default access
public class OtherClass {
    
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        
        // Accessing fields in another class within the same package
        System.out.println(example.publicField);        // Accessible
        System.out.println(example.protectedField);     // Accessible
        System.out.println(example.defaultField);       // Accessible
        // System.out.println(example.privateField);    // Not accessible
        
        // Calling methods in another class within the same package
        example.publicMethod();        // Accessible
        example.protectedMethod();     // Accessible
        example.defaultMethod();       // Accessible
        // example.privateMethod();    // Not accessible
    }
}
