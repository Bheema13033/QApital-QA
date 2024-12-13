package service;
import model.Book;
import model.Student;
import java.util.List;
public interface Service {
    void addStudent(Student student);

    //
    void deleteStudent(int studentId);

    void deleteStudentById(List<Student> students, int id);
    void updateStudent(Student student,int id);
    void displayStudents(List<Student> students);
    void getStudentById(List<Student> students, int id);
    void addBook(Book book);
    void removeBook(int bookId);
    void updateBook(Book book);
    void displayBooks(List<Book> books);
   void getBookById(List<Book> books, int id);
}
