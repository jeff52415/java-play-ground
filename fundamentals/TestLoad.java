// Import the Multiplier class from the load package
import loading.Multiplier;
import loading.deep.Calculator;

public class TestLoad {
    public static void main(String[] args) {
        // Create an instance of the Multiplier class
        Multiplier multiplier = new Multiplier();
        Calculator calculator = new Calculator();
        
        // Use the multiply method
        int result = multiplier.multiply(3, 4);
        
        // Print the result
        System.out.println("The result is: " + result);

        // Use the add method from the Calculator class
        int sum = calculator.add(5, 7);
        System.out.println("The sum is: " + sum);

        // Since Helper is non-public, it can only be used within the same package
        // Helper helper = new Helper(); // This would cause an error if uncommented
    }
}
