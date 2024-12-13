package School.model;

public class Teacher extends Person {
    private String SubjectTeacher;
    private double salary;
    public String getSubjectTeacher()
    {
        return SubjectTeacher;
    }
    public void setSubjectTeacher(String subjectTeacher)
    {
        SubjectTeacher = subjectTeacher;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    @Override
    void displayDetails()
    {
        System.out.println("id: " + getId());
        System.out.println("age: " + getAge());
        System.out.println("Name: " + getName());
        System.out.println("Course: " + SubjectTeacher);
        System.out.println("Marks: " +salary);
    }

}
