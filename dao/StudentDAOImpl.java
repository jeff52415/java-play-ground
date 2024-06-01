package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Robert"));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateStudent(Student student) {
        Student existingStudent = getStudent(student.getId());
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
        }
    }

    @Override
    public void deleteStudent(Student student) {
        students.removeIf(s -> s.getId() == student.getId());
    }
}
