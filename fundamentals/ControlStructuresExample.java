public class ControlStructuresExample {
    public static void main(String[] args) {
        int number = 10;

        // if-else statement
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative or zero");
        }

        // switch statement

        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the workweek");
                break;
            default:
                System.out.println("Mid-week");
                break;
        }
    }
}
