// This file defines the main class with different access modifiers
public class AccessModifiersExample {
    
    // Fields with different access modifiers

    // public: accessible from any class
    public String publicField = "Public Field";

    // protected: accessible from the same class, subclasses
    protected String protectedField = "Protected Field";

    // default: accessible from the same class, same package
    // diffrence between class and package is that package is a folder that contains classes
    String defaultField = "Default Field"; // package-private

    // private: accessible from the same class
    private String privateField = "Private Field";
    
    // Methods with different access modifiers
    public void publicMethod() {
        System.out.println("Public Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    void defaultMethod() {
        System.out.println("Default Method");
    }
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        
        // Accessing fields within the same class
        System.out.println(example.publicField);
        System.out.println(example.protectedField);
        System.out.println(example.defaultField);
        System.out.println(example.privateField);
        
        // Calling methods within the same class
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}
