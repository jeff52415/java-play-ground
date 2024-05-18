package fundamentals;

// Nonstatic methods are associated with a specific instance of a class and can interact with instance variables that store state unique to that instance.
// Static methods are associated with the class itself and are not bound to a particular object instance.
public class NonStatic {
    // Non-static method to calculate the product of two integers
    public int calculateProduct(int a, int b) {
        return a * b;
    }

    // The main method to demonstrate calling a non-static method
    public static void main(String[] args) {
        // Creating an instance of the MathOperations class
        NonStatic mathOps = new NonStatic();

        // Using the instance to call the non-static calculateProduct method
        int a = 23;
        int b = 76;


        int result = mathOps.calculateProduct(a, b);

        // Displaying the result
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
