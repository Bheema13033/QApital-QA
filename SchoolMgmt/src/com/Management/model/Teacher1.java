package com.Management.model;

public abstract class Teacher1 {
    private String name;
    private  String subject;
    private int salary;
    public Teacher1(String name,String subject,int salary){
        this.name=name;
        this.subject=subject;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public int getSalary(){
        return salary;
    }
}
