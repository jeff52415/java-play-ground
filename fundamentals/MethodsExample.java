package fundamentals;

public class MethodsExample {
    // Method with a return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Void method
    public static void greet() {
        System.out.println("Hello, Java Learner!");
    }

    public static void main(String[] args) {
        // Call method with parameters
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        // Call void method
        greet();
    }
}
