public class PostIncrementDecrement {
    public static void main(String[] args) {
        // Post-Increment Example
        int x = 10;
        int y = x++; // First, assign the original value of x (10) to y, then increment x to 11
        int z = ++x; // First, increment x to 12, then assign the new value of x (12) to z

        System.out.println("Post-Increment:");
        System.out.println("Initial value of x was 10.");
        System.out.println("Value assigned to y: " + y); // Should be 10, before increment
        System.out.println("Value of x after increment: " + x); // Should be 11
        System.out.println("Value of z: " + z); // Should be 12

        System.out.println("\n");

        // Post-Decrement Example
        int p = 20;
        int q = p--; // First, assign the original value of p (20) to q, then decrement p to 19

        System.out.println("Post-Decrement:");
        System.out.println("Initial value of p was 20.");
        System.out.println("Value assigned to q: " + q); // Should be 20, before decrement
        System.out.println("Value of p after decrement: " + p); // Should be 19
    }
}
