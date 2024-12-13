import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl {

    private List<Student> students;
    private ObjectMapper objectMapper;

    public StudentServiceImpl() {
        this.students = new ArrayList<>();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void addBookToStudent(int studentId, Book book) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.addBook(book);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void saveStudentsToFile(String filename) {
        try {
            objectMapper.writeValue(new File(filename), students);
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> loadStudentsFromFile(String filename) {
        try {
            students = objectMapper.readValue(new File(filename), objectMapper.getTypeFactory().constructCollectionType(List.class, Student.class));
            System.out.println("Students loaded from file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
