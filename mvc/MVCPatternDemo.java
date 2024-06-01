package mvc;

// Model: Represents the application's data and business logic. It directly manages the data, logic, and rules of the application.
// View: Displays the data to the user. It is the user interface of the application.
// Controller: Acts as an intermediary between Model and View. It listens to the input from the View, processes it (using the Model), and returns the output display to the View.

// Main
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo(10);
        return student;
    }
}