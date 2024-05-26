package exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
