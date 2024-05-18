package staticvsnonstatic;

public class OtherClass {
    
    public static void main(String[] args) {
        // Calling the static method from another class
        StaticVsNonStaticExample.staticMethod();
        
        // Calling the non-static method requires creating an instance
        StaticVsNonStaticExample example = new StaticVsNonStaticExample();
        example.nonStaticMethod();
    }
}
