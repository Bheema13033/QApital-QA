package School.model;

public class Student extends Person {
    private String course;
    private double marks;
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public double getMarks()
    {        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("id: " + getId());
        System.out.println("age: " + getAge());
        System.out.println("Name: " + getName());
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
    public char calculateGrade(int marks)
    {
        if(marks>70)
        {
            return 'A';
        }
        else if(marks>50)
        {
            return 'B';
        }
        else
        {
            return 'D';
        }
    }
}