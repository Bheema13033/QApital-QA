package com.Management.model;

    public abstract class Student1 {
        private String course;
        private  String name;
        private int marks;
        public Student1(String course,String name,int marks){
            this.course=course;
         //   this.subject=subject;
            this.marks=marks;
        }
        public String getCourse(){
            return course;
        }
        public String getName(){
            return name;
        }
        public int getMarks(){
            return marks;
        }
    }


