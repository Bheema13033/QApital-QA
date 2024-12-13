package model;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Student {

        private int studentId;
        private String name;
        private int age;
        private String mbNo;
        private List<Address> addresses;
        private List<Book> books;

        public Student(int studentId, String name, int age, String mbNo) {
            this.studentId = studentId;
            this.name = name;
            this.age = age;
            this.mbNo = mbNo;
            this.addresses = new ArrayList<>();
            this.books = new ArrayList<>();
        }

    public Student() {

    }

    public Student(int id, String name, Address address) {
    }

    // Getters and Setters
        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getMbNo() {
            return mbNo;
        }
        public void setMbNo(String mbNo) {
            this.mbNo = mbNo;
        }

        public List<Address> getAddresses() {
            return addresses;
        }
        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }

        public List<Book> getBooks() {
            return books;
        }
        public void setBooks(List<Book> books) {
            this.books = books;
        }

        @Override
        public String toString() {
            return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", mbNo=" + mbNo + ", addresses=" + addresses + ", books=" + books + "]";
        }
}



