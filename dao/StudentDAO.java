package dao;
// StudentDAO.java

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    Student getStudent(int id);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}