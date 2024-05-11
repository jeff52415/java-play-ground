public class Factorial {
    // Function to calculate factorial using recursion
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Main method
    // The main method in Java must specifically have the signature public static void main(String[] args)
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        // System.out.println
        // Purpose: Prints text and automatically adds a newline (line separator) after printing.
        System.out.println("Factorial of " + number + " is: " + result);
    }
}