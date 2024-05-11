import cal.Calculator;
import cal.Multiplier;

public class TestImport {
    public static void main(String[] args) {
        // The new keyword calls the class constructor to allocate memory for the new object and initialize it.
        Calculator calc = new Calculator();
        Multiplier mult = new Multiplier();

        int sum = calc.add(5, 3);
        int difference = calc.subtract(5, 3);
        int product = calc.multiply(5, 3);
        double quotient = calc.divide(5, 3);
        int multiply = mult.multiply(5, 7);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Multiply: " + multiply);
    }
}
