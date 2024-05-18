package math;

public class MainClass {
    public static void main(String[] args) {
        Helper1 helper1 = new Helper1();
        Helper2 helper2 = new Helper2();
        System.out.println("Using helpers: " + helper1.getMessage() + ", " + helper2.getMessage());
    }
}

class Helper1 {
    String getMessage() {
        return "Helper1 here";
    }
}

class Helper2 {
    String getMessage() {
        return "Helper2 here";
    }
}
