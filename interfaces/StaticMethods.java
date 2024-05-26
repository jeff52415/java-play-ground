package interfaces;

interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        int sum = Calculator.add(5, 3);
        int difference = Calculator.subtract(5, 3);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
