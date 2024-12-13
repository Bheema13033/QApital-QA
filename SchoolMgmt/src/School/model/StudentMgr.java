package School.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class StudentMgr{
    public static void main(String[] args)    {
        Scanner sc=new Scanner(System.in);
        while(true)        {
            System.out.println("Menu: ");
            System.out.println("1. Add Student\n 2.Add Teacher\n 3.exit\n");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("Enter Student course name: ");
                    String course = sc.next();
                    System.out.println("Enter Student marks name: ");
                    int marks = sc.nextInt();
                    System.out.println("Enter Student id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Student name: ");
                    String name = sc.next();
                    System.out.println("Enter Student age: ");
                    int age = sc.nextInt();
                    Student s=new Student();
                    s.setCourse(course);
                    s.setMarks(marks);
                    s.setId(id);
                    s.setName(name);
                    s.setAge(age);
                    ArrayList<Student> a1=new ArrayList<Student>();
                    a1.add(s);
                    s.displayDetails();
                    System.out.println(s.calculateGrade(marks));
                }                break;
                case 2:
                {
                    System.out.println("Enter Teacher subject name: ");
                    String subjectTeacher = sc.next();
                    System.out.println("Enter Teacher salary: ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter Teacher id: ");
                    int id1 = sc.nextInt();
                    System.out.println("Enter Teacher name: ");
                    String name1 = sc.next();
                    System.out.println("Enter  Teacher age: ");
                    int age1 = sc.nextInt();
                    School.model.Teacher t=new School.model.Teacher();
                    t.setSubjectTeacher(subjectTeacher);
                    t.setSalary(salary);
                    t.setId(id1);
                    t.setName(name1);
                    t.setAge(age1);
                    ArrayList<Teacher> a2=new ArrayList<Teacher>();
                    a2.add(t);
                    t.displayDetails();
                }
                break;
                case 3:
                {
                    System.out.println(" Thank you");
                }
                break;
                default:
                {
                    System.out.println("Invalid option");
                }
            }
        }
    }
}