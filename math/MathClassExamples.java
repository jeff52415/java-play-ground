package math;

public class MathClassExamples {
    public static void main(String[] args) {
        double x = 9.0;
        double y = 3.0;

        // Square root
        double sqrtX = Math.sqrt(x);

        // Power
        double xToThePowerY = Math.pow(x, y);

        // Trigonometric operations
        double sinY = Math.sin(y);
        double cosY = Math.cos(y);

        System.out.println("Square root of " + x + " is: " + sqrtX);
        System.out.println(x + " to the power of " + y + " is: " + xToThePowerY);
        System.out.println("Sine of " + y + " is: " + sinY);
        System.out.println("Cosine of " + y + " is: " + cosY);
    }
}
