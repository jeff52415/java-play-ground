package fundamentals;

public class VariablesExample {
    public static void main(String[] args) {
        // Integer types
        int age = 25;
        // The difference between int and long is the size of the memory, int is 4 bytes and long is 8 bytes
        // When you are assigning a value longer than the int range, which is -2,147,483,648 to 2,147,483,647, you need to add an L at the end of the number
        long population = 7800000000L;

        // Floating-point types
        // The float data type is a single-precision 32-bit IEEE 754 floating point
        // The double data type is a double-precision 64-bit IEEE 754 floating point
        // The difference between float and double is the size of the memory, float is 4 bytes and double is 8 bytes
        // When you are assigning a value with a decimal point larger than the float range, which is 3.4e−038 to 3.4e+038, you need to add an f at the end of the number
        double salary = 55000.50;
        // The difference between float and double is the size of the memory, float is 4 bytes and double is 8 bytes
        float height = 5.9f;

        // Character
        // The char data type is a single 16-bit Unicode character
        char grade = 'A';

        // Boolean
        boolean isJavaFun = true;
        
        // Print variables
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
