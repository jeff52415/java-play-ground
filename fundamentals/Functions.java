package fundamentals;

public class Functions {
    // A method that returns an integer and accepts an array of integers

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // A method that returns a boolean and accepts two integers
    public static boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    // A void method that prints a message and accepts a String parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // A method that returns a double and accepts no parameters
    public static double getPi() {
        return 3.14159;
    }

    // An instance method (non-static) that returns a string and accepts no parameters
    public String getWelcomeMessage() {
        return "Welcome to Java Programming!";
    }

    public static void main(String[] args) {
        // Example usage of the methods
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSum(numbers);
        System.out.println("Sum of array: " + sum);

        boolean result = isGreaterThan(10, 5);
        System.out.println("Is 10 greater than 5? " + result);

        greet("Alice");

        double piValue = getPi();
        System.out.println("The value of Pi is: " + piValue);

        // Create an object to call an instance method
        Functions functionsInstance = new Functions();
        String welcomeMessage = functionsInstance.getWelcomeMessage();
        System.out.println(welcomeMessage);
    }
}
