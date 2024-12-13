package service;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Book;
import model.Student;
import java.util.ArrayList;
import java.util.List;
public class ServiceImpl implements Service {
    private List<Student> students = new ArrayList<>();
    private List<Book> books = new ArrayList<>();


    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(int studentId) {

        students.removeIf(student -> student.getStudentId() == studentId);//
        System.out.println("Successfully deleted student with id " + studentId);//
    }

    @Override
    public void deleteStudentById(List<Student> students, int id) {
        students.removeIf(student -> student.getStudentId() == id);
        System.out.println("Successfully Removed student " + id);
        System.out.println("to check please select 7");
    }

    @Override
    public void updateStudent(Student student, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == student.getStudentId()) {
                students.set(i, student);
                break;
            }
        }
    }

    public void getStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", address:" + student.getAddresses());
            }
        }
    }

    public void displayStudents(List<Student> students) {
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", name: " + student.getName() + ", Age: " + student.getAge() + ", address: " + student.getAddresses());
        }
    }

    @Override
    public void addBook(Book book) {
        books.add(book);

    }

    @Override
    public void removeBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }

    @Override
    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == book.getBookId()) {
                books.set(i, book);
                break;
            }
        }
    }

    public void displayBooks(List<Book> books) {
        System.out.println("\nBooks:");
        for (Book bk : books) {
            System.out.println("ID: " + bk.getBookId() + ", Book Count: " + bk.getBookCount() + ", Subject Name " + bk.getSubject());
        }
    }

    public void getBookById(List<Book> books, int id) {
        for (Book bk : books) {
            if (bk.getBookId() == id) {
                System.out.println("ID: " + bk.getBookId() + ", Subject Name: " + bk.getSubject() + ", Book Count: " + bk.getBookCount());
            }
        }

    }
}




