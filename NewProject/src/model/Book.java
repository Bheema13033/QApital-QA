package model;

import java.util.ArrayList;
import java.util.List;

public class Book  {
    private int bookId;
    private String subject;
    private int bookCount;
    private List<Student> students;

    public Book(int bookId, String subject, int bookCount) {
        this.bookId = bookId;
        this.subject = subject;
        this.bookCount = bookCount;
        this.students = new ArrayList<>();
    }

    public Book() {

    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", subject=" + subject + ", bookCount=" + bookCount + ", students=" + students + "]";
    }
}

