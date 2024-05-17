package accesscontrol;
// This file defines a subclass to test protected and public access
public class SubclassExample extends AccessModifiersExample {
    
    public static void main(String[] args) {
        SubclassExample subclass = new SubclassExample();
        
        // Accessing fields in a subclass
        System.out.println(subclass.publicField);        // Accessible
        System.out.println(subclass.protectedField);     // Accessible
        // System.out.println(subclass.defaultField);    // Not accessible
        // System.out.println(subclass.privateField);    // Not accessible
        
        // Calling methods in a subclass
        subclass.publicMethod();        // Accessible
        subclass.protectedMethod();     // Accessible
        // subclass.defaultMethod();    // Not accessible
        // subclass.privateMethod();    // Not accessible
    }
}
