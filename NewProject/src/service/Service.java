package service;

    import model.Book;
    import model.Student;

    import java.util.List;

    public interface Service {


        void addStudent(Student student);
        List<Student> getAllStudents();
        Student getStudentById(int studentId);
        void updateStudentDetail(int studentId);
        void removeStudent(int studentId);

        void addBook(Book book);
        List<Book> getAllBooks();
        Book getBookById(int bookId);
        void updateBookDetail(int bookId, String newSubject, int newBookCount);
        void removeBook(int bookId);

        void borrowBook(int studentId, int bookId, int borrowCount);
    }


