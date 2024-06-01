package dao;

public class DAOPatternDemo {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        // Print all students
        for (Student student : studentDAO.getAllStudents()) {
            System.out.println("Student: [ID : " + student.getId() + ", Name : " + student.getName() + " ]");
        }

        // Update student
        Student student = studentDAO.getAllStudents().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        // Get the student
        student = studentDAO.getStudent(1);
        System.out.println("Student: [ID : " + student.getId() + ", Name : " + student.getName() + " ]");

        // Delete student
        studentDAO.deleteStudent(student);

        // Print all students after deletion
        for (Student s : studentDAO.getAllStudents()) {
            System.out.println("Student: [ID : " + s.getId() + ", Name : " + s.getName() + " ]");
        }
    }
}
