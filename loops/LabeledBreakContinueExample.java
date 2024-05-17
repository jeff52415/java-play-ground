public class LabeledBreakContinueExample {
    public static void main(String[] args) {
        // Label the outer loop
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                // Skip printing when both `i` and `j` are 2
                if (i == 2 && j == 2) {
                    continue outerLoop; // Skip to the next iteration of the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
