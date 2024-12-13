package controller;
import model.Address;
import model.Book;
import model.Student;
import service.Service;
import service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Controller {
    public static void main(String[] args)
    {        Scanner scanner = new Scanner(System.in);
        ServiceImpl service=new ServiceImpl();
        Student s=new Student();
        Book b=new Book();
        List<Student> student = new ArrayList<>();
        List<Book> book = new ArrayList<>();
        List<Address> address = new ArrayList<>();
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Choose an option:");
            System.out.println("1. student\n 2.Book\n 3.Exit\n");
            int choice1 = scanner.nextInt();
            switch (choice1)
            {
                case 1:
                {
                    System.out.println("Choose an option:");
                    System.out.println("1. Add Student\n   2. Delete Student\n 3. Update Student\n 4.get Student By Id\n 5.get All Students\n 6.Exit\n");
                    int choice2 = scanner.nextInt();
                    switch (choice2)
                    {
                        case 1:
                        {
                            while (true)
                            {
                                System.out.print("Enter student's Id: ");
                                int id = sc.nextInt();
                                System.out.print("Enter student's name: ");
                                String name = sc.next();
                                System.out.print("Enter student's age: ");
                                int age = sc.nextInt();
                                System.out.print("Enter complete Address: ");
                                String completeaddress = sc.next();
                                System.out.print("Enter pincode: ");
                                int pincode = sc.nextInt();
                                Address add = new Address();
                                add.setPincode(String.valueOf(pincode));
                                add.setCompleteAddress(completeaddress);
                                address.add(add);
                                student.add(new Student(id, name, age, address.toString()));
                                System.out.print("Do you want to add another teacher? (yes/no): ");
                                String response = sc.next();
                                if (!response.equalsIgnoreCase("yes")) {
                                    break;
                                }
                            }
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Enter student's Id: ");
                            int studentId = sc.nextInt();
                            service.removeStudent(studentId);
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Enter student's Id: ");
                            int studentId = sc.nextInt();
                            service.updateStudentDetail();
                        }                        break;
                        case 4:
                        {
                            System.out.println("Enter student's Id: ");
                            int studentId = sc.nextInt();
                            service.getStudentById(s, studentId);
                        }
                        break;
                        case 5:
                        {
                            service.displayStudents(student);
                        }
                        break;
                        case 6:
                        {
                            return;
                        }
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Choose an option:");
                    System.out.println("1. Add Book\n 2. Remove Book\n 3. Update Book\n 4.get All Book\n 5.get All Book\n 6.Exit\n ");
                    int choice3 = scanner.nextInt();
                    switch (choice3)
                    {
                        case 1:
                        {
                            System.out.print("Enter book Id: ");
                            int bookId = sc.nextInt();
                            System.out.print("Enter book name: ");
                            String bookName = sc.next();
                            System.out.print("Enter author: ");
                            String author = sc.next();
                            System.out.print("Enter book count: ");
                            int bookCount = sc.nextInt();
                            System.out.print("Enter subjectName: ");
                            String subjectName = sc.next();
                            Book bk=new Book(bookId,bookName,author,bookCount,subjectName);
                            System.out.print("Do you want to add another book? (yes/no): ");
                            String response = sc.next();
                            if (!response.equalsIgnoreCase("yes"))
                            {
                                break;
                            }
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Enter book Id: ");
                            int bookId = sc.nextInt();
                            service.removeBook(bookId);
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Enter book's Id: ");
                            int  bookId= sc.nextInt();
                            service.updateBook(b);
                        }
                        break;
                        case 4:
                        {
                        }
                        case 5:
                        {
                            System.exit(0);
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid choice. Try again.");
                        }
                        break;
                    }
                }
            }
        }
    }
}
