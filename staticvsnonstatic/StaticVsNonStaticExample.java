package staticvsnonstatic;

public class StaticVsNonStaticExample {
    
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
    
    public static void main(String[] args) {
        // Calling the static method
        StaticVsNonStaticExample.staticMethod();
        
        // Calling the non-static method requires creating an instance
        StaticVsNonStaticExample example = new StaticVsNonStaticExample();
        example.nonStaticMethod();
    }
}
